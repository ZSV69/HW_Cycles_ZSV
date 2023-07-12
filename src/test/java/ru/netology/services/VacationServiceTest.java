package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacations.csv")

    public void shouldVacationsExact(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        //int expected = 2;
        int actual = service.calculateVacationMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//
//    public void shouldVacationsInExact() {
//        VacationService service = new VacationService();
//        int expected = 3;
//        int actual = service.calculateVacationMonths(10_000, 3_000, 20_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}
