package ru.atikhonov;

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
    }
}
