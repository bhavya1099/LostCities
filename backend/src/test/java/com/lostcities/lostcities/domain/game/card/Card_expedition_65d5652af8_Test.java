// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.lostcities.lostcities.domain.game.card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

public class Card_expedition_65d5652af8_Test {

    private Card card;
    private static final int MIN_VALUE = 2;
    private static final int MAX_VALUE = 10;

    @BeforeEach
    public void setup() {
        card = new Card(Color.RED, 5, 0);
    }

    @Test
    public void testExpedition_ValidNumber() {
        Card testCard = Card.expedition(Color.RED, 5);
        Assertions.assertEquals(card, testCard, "Expedition card number is valid, should return new Card object");
    }

    @Test
    public void testExpedition_NumberLessThanMin() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Card.expedition(Color.RED, 1),
                "Expedition card number is less than MIN_VALUE, should throw IllegalArgumentException");
    }

    @Test
    public void testExpedition_NumberGreaterThanMax() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Card.expedition(Color.RED, 11),
                "Expedition card number is greater than MAX_VALUE, should throw IllegalArgumentException");
    }
}
