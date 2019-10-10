package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Job3 {
    private String maintext;

    public Job3(){}

    public void ConsoleInPut(){//Ввод входного текста
        Scanner in = new Scanner(System.in);
        this.maintext = in.nextLine();
    }

    public void Work1(){ //Выводит только то, что в *
        Pattern pattern = Pattern.compile("[*].+[*]");
        Matcher matcher = pattern.matcher(maintext);
        if(matcher.find()){
            System.out.println(true);
        }
        else{
            System.out.print(false);
        }
    }

    public void Work2(){//Выводит текст без *
        Pattern pattern = Pattern.compile("[*].+[*]");
        Matcher matcher = pattern.matcher(maintext);
        String clear = matcher.replaceAll("");
        System.out.println(clear);
    }
}
//меню для 3 и 1 задачи, тесты через клавиатуру, регулярное выражение в 1 задании, булевское в 3 задании,