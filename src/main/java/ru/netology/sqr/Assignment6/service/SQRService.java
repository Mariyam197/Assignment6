package ru.netology.sqr.Assignment6.service;

public class SQRService {
    public int calcSQR(int min, int max) {

        int count = 0; // count - количество квадратов
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= min) && (i * i <= max)) {
                count++;
            }
        }
        return count;
    }
}
