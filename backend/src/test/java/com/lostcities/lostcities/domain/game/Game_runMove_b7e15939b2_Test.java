// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.lostcities.lostcities.domain.game;

import com.lostcities.lostcities.domain.game.card.Card;
import com.lostcities.lostcities.domain.game.card.Deck;
import com.lostcities.lostcities.domain.game.exception.EmptyDeckException;
import com.lostcities.lostcities.domain.game.exception.GameNotStartedException;
import com.lostcities.lostcities.domain.game.exception.IllegalMoveException;
import com.lostcities.lostcities.domain.game.exception.NotPlayersTurnException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Game_runMove_b7e15939b2_Test {

    @Mock
    private Deck deck;

    @Mock
    private Board board;

    @Mock
    private Move move, previousMove;

    private Game game;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        game = new Game();
    }

    @Test
    public void testRunMove_Success() {
        game.runMove(move, previousMove);
        verify(move).execute(deck, board);
    }

    @Test
    public void testRunMove_IllegalMoveException() {
        when(move.validate(move, previousMove)).thenThrow(new IllegalMoveException());
        assertThrows(IllegalMoveException.class, () -> game.runMove(move, previousMove));
    }

    @Test
    public void testRunMove_NotPlayersTurnException() {
        when(move.validate(move, previousMove)).thenThrow(new NotPlayersTurnException());
        assertThrows(NotPlayersTurnException.class, () -> game.runMove(move, previousMove));
    }

    @Test
    public void testRunMove_EmptyDeckException() {
        when(move.execute(deck, board)).thenThrow(new EmptyDeckException());
        assertThrows(EmptyDeckException.class, () -> game.runMove(move, previousMove));
    }

    @Test
    public void testRunMove_GameNotStartedException() {
        when(move.execute(deck, board)).thenThrow(new GameNotStartedException());
        assertThrows(GameNotStartedException.class, () -> game.runMove(move, previousMove));
    }
}
