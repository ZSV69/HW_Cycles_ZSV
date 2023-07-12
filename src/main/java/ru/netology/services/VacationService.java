package ru.netology.services;

public class VacationService {

    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int money = 0;
        int vacationMonths = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                vacationMonths++;
                money = (money - expenses) / 3;
            } else {
                money = (money + income) - expenses;
            }
        }
        return vacationMonths;
    }
}
