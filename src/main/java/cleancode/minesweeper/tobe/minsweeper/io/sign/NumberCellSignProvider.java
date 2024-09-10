package cleancode.minesweeper.tobe.minsweeper.io.sign;

import cleancode.minesweeper.tobe.minsweeper.board.cell.CellSnapshot;
import cleancode.minesweeper.tobe.minsweeper.board.cell.CellSnapshotStatus;

public class NumberCellSignProvider implements CellSignProvidable{

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return String.valueOf(cellSnapshot.getNearbyLandMineCount());
    }

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.NUMBER);
    }
}
