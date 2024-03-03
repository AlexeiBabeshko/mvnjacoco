package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMaxEmptyArray() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {-12, -5, -8, -4, -5, -3, -8, -6, -11, -11, -12};
        long expected = -3;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

}