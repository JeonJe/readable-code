package cleancode.minesweeper.tobe;

import cleancode.minesweeper.asis.gamelevel.Beginner;
import cleancode.minesweeper.asis.gamelevel.GameLevel;
import cleancode.minesweeper.tobe.config.GameConfig;
import cleancode.minesweeper.tobe.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.io.ConsoleOutputHandler;
import cleancode.minesweeper.tobe.io.InputHandler;
import cleancode.minesweeper.tobe.io.OutputHandler;

public class GameApplication {



    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig(
                new Beginner(),
                new ConsoleInputHandler(),
                new ConsoleOutputHandler()
        );
        Minesweeper mineSweeper = new Minesweeper(gameConfig);
        mineSweeper.initialize();
        mineSweeper.run();
    }

}

