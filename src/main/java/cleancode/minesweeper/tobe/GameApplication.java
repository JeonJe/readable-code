package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.minsweeper.Minesweeper;
import cleancode.minesweeper.tobe.minsweeper.config.GameConfig;
import cleancode.minesweeper.tobe.minsweeper.gamelevel.Advanced;
import cleancode.minesweeper.tobe.minsweeper.gamelevel.VeryBeginner;
import cleancode.minesweeper.tobe.minsweeper.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.minsweeper.io.ConsoleOutputHandler;

public class GameApplication {



    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig(
                new Advanced(),
                new ConsoleInputHandler(),
                new ConsoleOutputHandler()
        );
        Minesweeper mineSweeper = new Minesweeper(gameConfig);
        mineSweeper.initialize();
        mineSweeper.run();
    }

}

