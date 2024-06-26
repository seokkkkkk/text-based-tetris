package com.tetris.model;

import com.tetris.logic.Block;

import java.awt.Color;

public class LBlock extends Block {
    public LBlock() {
        super(new int[][] {
            {0, 0, 0, 0},
            {0, 3, 3, 3},
            {0, 3, 0, 0},
            {0, 0, 0, 0}
        }, new Color[]{Color.ORANGE, Color.WHITE,  Color.WHITE,  Color.RED});
    }
}
