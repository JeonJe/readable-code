package cleancode.minesweeper.tobe.minsweeper.io;

import cleancode.minesweeper.tobe.minsweeper.board.position.CellPosition;
import cleancode.minesweeper.tobe.minsweeper.user.UserAction;

public interface InputHandler {

    CellPosition getCellPositionFromUser();

    UserAction getUserActionFromUser();

}
