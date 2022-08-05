package ru.skypro;

import java.time.LocalDate;

public class Main {
    public static void checkYear(int year)
    {
        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkPhone(int clientOs, int clientDeviceYear)
    {
        int currentYear = LocalDate.now().getYear();
        if(clientOs == 0 && clientDeviceYear > currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOs == 1 && clientDeviceYear > currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int distance(int deliveryDistance)
    {
        if (deliveryDistance <= 20) {
            return  1;
        }
        else if (deliveryDistance <= 60) {
            return  2;
        }
        else if (deliveryDistance < 100) {
            return  3;
        }
        return -1;
    }

    public static void main(String[] args) {
	// Задание 1
        checkYear(2022);

        //Задание 2
        checkPhone(1, 2023);

        //Задание 3
        int day = distance(45);
        System.out.println("Потребуется дней: "+day);
    }
}
