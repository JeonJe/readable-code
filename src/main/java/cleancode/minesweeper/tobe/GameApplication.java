package cleancode.minesweeper.tobe;

import cleancode.minesweeper.asis.gamelevel.Advanced;
import cleancode.minesweeper.asis.gamelevel.GameLevel;

public class GameApplication {

    public static void main(String[] args) {
        GameLevel gameLevel = new Advanced();
        MineSweeper mineSweeper = new MineSweeper(gameLevel);
        mineSweeper.run();
    }

}

