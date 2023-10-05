// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.lostcities.lostcities.domain.game;

import com.lostcities.lostcities.domain.game.player.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class Game_getPlayerById_70faac0612_Test {

    @Mock
    private Game game;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPlayerById() {
        Player player1 = new Player(1L, "Player1");
        Player player2 = new Player(2L, "Player2");
        when(game.getPlayersStream()).thenReturn(Stream.of(player1, player2));

        Optional<Player> result = game.getPlayerById(1L);
        assertTrue(result.isPresent());
        assertEquals(player1, result.get());
    }

    @Test
    public void testGetPlayerByIdNotFound() {
        Player player1 = new Player(1L, "Player1");
        Player player2 = new Player(2L, "Player2");
        when(game.getPlayersStream()).thenReturn(Stream.of(player1, player2));

        Optional<Player> result = game.getPlayerById(3L);
        assertFalse(result.isPresent());
    }
}
