package ru.netology.sqr.Assignment6.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void shouldCalExact(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calcSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }
}


