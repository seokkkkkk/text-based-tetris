package com.tetris.ui;

import com.tetris.logic.SettingController;
import org.junit.jupiter.api.Test;

import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameOverScreenTest {

    @Test
    void actionPerformedTest() {
        // Create a GameOverScreen instance
        GameOverScreen gameOverScreen = new GameOverScreen(100, false);
        MainMenuScreen menuScreen = new MainMenuScreen();
        SettingController settingController = new SettingController();

        // Simulate action event with command "menu"
        ActionEvent menuEvent = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "menu");
        gameOverScreen.actionPerformed(menuEvent);
        // Check if GameOverScreen is not visible
        assertFalse(gameOverScreen.isShowing());
        assertTrue(menuScreen.isVisible(), "MainMenuScreen should become visible after clicking Menu");
        // Check if MainMenuScreen is properly initialized
        // assertTrue(MainMenuScreen.class.isInstance(gameOverScreen.getFocusOwner()));

        // Simulate action event with command "replay"
        ActionEvent replayEvent = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "replay");
        gameOverScreen.actionPerformed(replayEvent);
        // Check if GameOverScreen is not visible
        assertFalse(gameOverScreen.isVisible(), "GameOverScreen should become invisible after clicking Replay.");
        // Check if GameController is properly initialized
        // assertNotNull(gameOverScreen.getFocusOwner());
    }
}
