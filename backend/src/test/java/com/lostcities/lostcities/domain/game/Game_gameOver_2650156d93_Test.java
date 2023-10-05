// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.lostcities.lostcities.domain.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Game_gameOver_2650156d93_Test {

    @InjectMocks
    private Game game;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        game.setStatus(Status.Started);
        game.setCurrentTurnPlayer(new Player());
    }

    @Test
    public void testGameOver_statusEnded() {
        game.gameOver();
        assertEquals(Status.Ended, game.getStatus());
    }

    @Test
    public void testGameOver_currentTurnPlayerNull() {
        game.gameOver();
        assertNull(game.getCurrentTurnPlayer());
    }
}
