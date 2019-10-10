package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Создание меню:
        Scanner in = new Scanner(System.in);
        int y;
        while (true){
            System.out.println("\nМеню Лаб2 Строки:");
            System.out.println("1. Задание 1: Применение класса String");
            System.out.println("2. Задание 2: Применение класса StringBuilder");
            System.out.println("3. Задание 3: Регулярные выражения");
            System.out.println("4. Выход из программы");
            y = in.nextInt();
            switch(y){
                case 1: Exec1();
                    break;
                case 2: Exec2();
                    break;
                case 3: Exec3();
                    break;
                case 4: System.exit(0);
                    break;

            }
        }
    }

    public static void Exec1(){ // Задание 1
        Job1 work1 = new Job1();
        System.out.println("Введите входной текст с клавиатуры. Для разделения используйте точку:");
        work1.ConsoleInPut();
        System.out.println("\nЗаданание 1.1 - Скольк раз встречается (Ж):");
        work1.Work1();
        System.out.println("\nЗаданание 1.2 - поменять шрифт:");
        work1.Work2();
        System.out.println("\nЗаданание 1.3 - Вставить строку:");
        work1.Work3();
        System.out.println("\nЗаданание 1.4 - Найти все числа и выдать их форматирование:");
        work1.Work4();
    }

    public static void Exec2 (){ // Задание 2
        Job2 work2 = new Job2();
        System.out.println("Вывод не отсортированного массива:");
        work2.OutStence();
        System.out.println("'\nВывод отсортированного массива:");
        work2.SortStence();
        work2.OutStence();
        System.out.println("\nЗадание 2.1 - Добавление сотрудника");
        work2.Work1();
        work2.SortStence();
        work2.OutStence();
        System.out.println("\nЗадание 2.2 - Удаление сотрудника по коду");
        work2.Work2();
        work2.SortStence();
        work2.OutStence();
        System.out.println("\nЗадание 2.3 - Добавление к коду 3 нуля");
        work2.Work3();


    }

    public static void Exec3 (){ // Задание 3
        Job3 work3 = new Job3();
        System.out.println("Введите входной текст с клавиатуры:");
        work3.ConsoleInPut();
        System.out.println("\nЗадание 3.1 - ограниченен ли текст символом * (если ограниен - true; если нет - false):");
        work3.Work1();
        System.out.println("\nЗадание 3.2 - Удалить из текста все подстроки удовлетворяющие заданию 3.1:");
        work3.Work2();
    }
}