package org.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.List;

import org.example.FinalExample.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FinalExampleOrderTest {

    private String customerName = "el customer";

    private List<String> items = List.of("item1", "item2");

    private double total = 17.50;

    private Order order;

    @BeforeEach
    void setUp() {
        FinalExample example = new FinalExample();
        order = example.new Order(customerName, items, total);
    }

    @Test
    void canPrintOrderSummary() {
        // when & then
        assertDoesNotThrow(() -> order.printOrderSummary());
    }
}
