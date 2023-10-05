// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.lostcities.lostcities.application.service;

import com.lostcities.lostcities.application.dto.GameDto;
import com.lostcities.lostcities.domain.game.Game;
import com.lostcities.lostcities.domain.game.GameRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GameService_getGame_b2204a9685_Test {

    @InjectMocks
    GameService gameService;

    @Mock
    GameRepository gameRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetGame() {
        Game game = new Game();
        game.setId(1L);
        when(gameRepository.findById(1L)).thenReturn(java.util.Optional.of(game));

        GameDto result = gameService.getGame(1L);
        assertEquals(1L, result.getId());
    }

    @Test
    public void testGetGameNotFound() {
        when(gameRepository.findById(1L)).thenReturn(java.util.Optional.empty());

        GameDto result = gameService.getGame(1L);
        assertEquals(null, result);
    }
}
