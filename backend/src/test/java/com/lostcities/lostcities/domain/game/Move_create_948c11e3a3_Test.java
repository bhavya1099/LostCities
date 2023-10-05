// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.lostcities.lostcities.domain.game;

import com.lostcities.lostcities.domain.game.card.Color;
import com.lostcities.lostcities.domain.game.player.Player;
import com.lostcities.lostcities.domain.game.move.Move;
import com.lostcities.lostcities.domain.game.move.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class Move_create_948c11e3a3_Test {
    Player mockPlayer;
    Type mockType;
    Color mockColor;

    @BeforeEach
    void setUp() {
        mockPlayer = mock(Player.class);
        mockType = mock(Type.class);
        mockColor = mock(Color.class);
    }

    @Test
    public void testCreateMove() {
        Move move = Move.create(mockPlayer, mockType, mockColor);
        assertNotNull(move);
        assertEquals(mockPlayer, move.getPlayer());
        assertEquals(mockType, move.getType());
        assertEquals(mockColor, move.getColor());
    }
    
    @Test
    public void testCreateMoveNullPlayer() {
        assertThrows(NullPointerException.class, () -> Move.create(null, mockType, mockColor));
    }

    @Test
    public void testCreateMoveNullType() {
        assertThrows(NullPointerException.class, () -> Move.create(mockPlayer, null, mockColor));
    }

    @Test
    public void testCreateMoveNullColor() {
        assertThrows(NullPointerException.class, () -> Move.create(mockPlayer, mockType, null));
    }
}
