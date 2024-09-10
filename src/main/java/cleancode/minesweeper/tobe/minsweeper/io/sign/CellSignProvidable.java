package cleancode.minesweeper.tobe.minsweeper.io.sign;

import cleancode.minesweeper.tobe.minsweeper.board.cell.CellSnapshot;

public interface CellSignProvidable {
    String provide(CellSnapshot cellSnapshot);

    boolean supports(CellSnapshot cellSnapshot);
}
