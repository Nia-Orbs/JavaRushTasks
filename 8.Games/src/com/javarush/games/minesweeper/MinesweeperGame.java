package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {

    private final static int SIDE = 9;

    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    private int countMinesOnField;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame(){
        int count = 0;
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                boolean isMine = i == getRandomNumber(10);
                gameField[i][j] = new GameObject(j, i, isMine);
                if (isMine) {
                    count++;
                }
                setCellColor(i, j, Color.CORAL);
            }
        }

        countMinesOnField = count;
    }
}
