// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.lostcities.lostcities.domain.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Game_getId_3d7d4d4e1a_Test {

    private Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testGetId() {
        long expectedId = 12345L;
        game.setId(expectedId);
        long actualId = game.getId();
        assertEquals(expectedId, actualId, "The expected ID does not match the actual ID");
    }

    @Test
    public void testGetIdWithZero() {
        long expectedId = 0L;
        game.setId(expectedId);
        long actualId = game.getId();
        assertEquals(expectedId, actualId, "The expected ID does not match the actual ID");
    }
}
