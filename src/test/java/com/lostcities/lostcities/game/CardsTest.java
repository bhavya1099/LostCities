package com.lostcities.lostcities.game;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.List;

import static org.junit.Assert.*;

public class CardsTest {

    @Test
    public void testGetShuffledDeck() {
        LinkedHashSet<Card> deck = Cards.getShuffledDeck(1L);
        System.out.println(deck);
        assertEquals(
                "Deck is properly shuffled",
                 "[BLUE_1_2, RED_7_0, GREEN_5_0, YELLOW_1_1, WHITE_7_0, WHITE_1_2, YELLOW_7_0, YELLOW_1_0, YELLOW_2_0, WHITE_1_1, BLUE_1_1, RED_6_0, RED_4_0, BLUE_5_0, YELLOW_9_0, GREEN_3_0, GREEN_4_0, GREEN_8_0, YELLOW_5_0, RED_9_0, BLUE_1_0, RED_5_0, YELLOW_1_2, GREEN_6_0, WHITE_8_0, BLUE_6_0, RED_8_0, BLUE_9_0, WHITE_4_0, WHITE_6_0, WHITE_3_0, GREEN_1_2, BLUE_7_0, BLUE_8_0, RED_1_1, YELLOW_4_0, BLUE_4_0, BLUE_2_0, WHITE_9_0, RED_1_0, WHITE_1_0, GREEN_9_0, WHITE_2_0, GREEN_1_0, GREEN_1_1, GREEN_2_0, GREEN_7_0, RED_1_2, YELLOW_6_0, YELLOW_3_0, RED_2_0, YELLOW_8_0, RED_3_0, WHITE_5_0, BLUE_3_0]",
                deck.toString()
        );
    }

}