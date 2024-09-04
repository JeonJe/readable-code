package cleancode.minesweeper.tobe.position;

import cleancode.minesweeper.tobe.cell.Cell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CellPositions {
    private final List<CellPosition> positions;

    private CellPositions(List<CellPosition> positions) {
        this.positions = positions;
    }

    public static CellPositions of(List<CellPosition> positions){
        return new CellPositions(positions);
    }

    public static CellPositions from(Cell[][] board) {
        List<CellPosition> cellPositions = new ArrayList<>();

       for (int row = 0; row < board.length; row++) {
           for(int col = 0; col < board[row].length; col++) {
               CellPosition cellPosition = CellPosition.of(row, col);
               cellPositions.add(cellPosition);
           }
       }
       return CellPositions.of(cellPositions);
    }

    public List<CellPosition> extractRandomPositions(int count) {
        List<CellPosition> cellPositions = new ArrayList<>(positions);
        Collections.shuffle(cellPositions);
        return cellPositions.subList(0, count);
    }

    public List<CellPosition> subtract(List<CellPosition> positionListToSubtract) {
        List<CellPosition> cellPositions = new ArrayList<>(positions);

        CellPositions positionsToSubtract = CellPositions.of(positionListToSubtract);
        return cellPositions.stream()
                .filter(positionsToSubtract::doseNotContain)
                .toList();
    }

    private boolean doseNotContain(CellPosition position) {
        return !positions.contains(position);
    }

    public List<CellPosition> getPositions() {
        return new ArrayList<>(positions);
    }
}
