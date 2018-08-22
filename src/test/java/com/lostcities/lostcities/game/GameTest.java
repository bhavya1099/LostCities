package com.lostcities.lostcities.game;

import com.lostcities.lostcities.entity.GameEntity;
import com.lostcities.lostcities.entity.PlayerEntity;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {


    @Test
    public void createGameAndSeedFromEntities() {
        GameEntity gameEntity;

        PlayerEntity p1 = new PlayerEntity();
        p1.setId(1L);
        p1.setName("Bill");


        PlayerEntity p2 = new PlayerEntity();
        p2.setId(2L);
        p2.setName("Rachel");

        gameEntity = GameEntity.createGame(p1);
        gameEntity.setSeed(999L);
        gameEntity.setPlayer2(p2);

        Game game = Game.fromGameEntity(gameEntity);


        Player player1 = game.getPlayerById(1L).get();
        Player player2 = game.getPlayerById(2L).get();

        assertEquals("Player 1 has an id of 1", Long.valueOf(1L), player1.getPlayerId());
        assertEquals("Player 2 has an id of 2", Long.valueOf(2L), player2.getPlayerId());

        assertEquals("Player 1 is named Bill", "Bill", player1.getName());
        assertEquals("Player 2 is named Rachel", "Rachel", player2.getName());

        assertEquals("Player 1 has 8 cards", 8, player1.getHand().size());
        assertEquals("Player 2 has 8 cards", 8, player2.getHand().size());

        assertEquals(
                "Player 1's hand is valid",
                "[BLUE_9_0, YELLOW_4_0, RED_5_0, YELLOW_3_0, YELLOW_9_0, BLUE_1_1, WHITE_2_0, RED_4_0]",
                player1.getHand().toString()
                );

        assertEquals(
                "Player 2's hand is valid",
                "[BLUE_6_0, WHITE_1_0, WHITE_3_0, BLUE_2_0, GREEN_5_0, BLUE_3_0, WHITE_6_0, BLUE_8_0]",
                player2.getHand().toString());
    }
}