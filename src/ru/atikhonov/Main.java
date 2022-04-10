package ru.atikhonov;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
    //Задание 1
    int i = 1;
	while(i <= 10) {
        System.out.print(i + " ");
        if (i == 10) {
            System.out.print("\n");
            break;
        }
        i++;
    }
    for(; i > 0; i--) {
        System.out.print(i + " ");
    }
    System.out.print("\n");
    //Задание 2
    for(i = 1; i <= 31; i += 7) {
        System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
    }
    //Задание 3
    int currentYear = 2022;
    int leftBoundary = currentYear - 200;
    int rightBoundary = currentYear + 100;
    for (i = 0; i <= rightBoundary; i += 79 ) {
        if (i >= leftBoundary) System.out.println(i);
    }
    System.out.println("Доп задание");
    //Задание 5
    for (i = 1; i <= 30; i++) {
        System.out.print(i + ": ");
        if ((i % 3 == 0) && (i % 5 != 0)) System.out.print("ping");
            else if ((i % 5 == 0) && (i % 3 != 0)) System.out.print("pong");
        if ((i % 5 == 0) && (i % 3 == 0)) System.out.print("ping pong");
        System.out.println();
    }
    //Задание 6
    int firstPreviousNumber = 0;
    int secondPreviousNumber = 1;
    int currentNumber;
    System.out.print(firstPreviousNumber + ", " + secondPreviousNumber + ", ");
    for (i = 0; i <= 10; i++) {
        currentNumber = firstPreviousNumber + secondPreviousNumber;
        if (i < 10) System.out.print(currentNumber + ", ");
            else System.out.print(currentNumber);
        firstPreviousNumber = secondPreviousNumber;
        secondPreviousNumber = currentNumber;
        }
    }
}
