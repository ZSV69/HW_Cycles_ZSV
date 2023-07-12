package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test

    public void shouldVacationsExact() {
        VacationService service = new VacationService();
        int expected = 2;
        int actual = service.calculateVacationMonths(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldVacationsInExact() {
        VacationService service = new VacationService();
        int expected = 3;
        int actual = service.calculateVacationMonths(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
}
