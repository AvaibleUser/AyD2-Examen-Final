package org.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.example.FinalExample.ReportGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FinalExampleReportGenerator {

    private ReportGenerator reportGenerator;

    @BeforeEach
    void setUp() {
        FinalExample finalExample = new FinalExample();
        reportGenerator = finalExample.new ReportGenerator();
    }

    @Test
    void canPrintHeader() {
        // given
        String customer = "el comprador";

        // when & then
        assertDoesNotThrow(() -> reportGenerator.printHeader(customer));
    }

    @Test
    void canPrintLineItem() {
        // given
        String item = "item line";

        // when & then
        assertDoesNotThrow(() -> reportGenerator.printLineItem(item));
    }

    @Test
    void canPrintTotal() {
        // given
        double total = 17.50;

        // when & then
        assertDoesNotThrow(() -> reportGenerator.printTotal(total));
    }
}
