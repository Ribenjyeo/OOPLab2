package com.company;
import javax.swing.*;
import java.lang.String;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Job1 {
    private String maintext;

    public Job1(){ //Конструктор без параметров
    }

    public void ConsoleInPut(){//Ввод входного текста
        Scanner in = new Scanner(System.in);
        this.maintext = in.nextLine();
    }

    public void Work1(){ //Определить сколько раз встречалось (Ж)
        String args[] = maintext.split("[.]");
        String[] search = args[0].split("\\(Ж\\)");
        int j = search.length-1;
        System.out.println("В первом предложении использовалось нацертание (Ж) " + j+ " раза");
    }

    public void Work2(){
        String args[] = maintext.split("[.]");
        System.out.println("На какой шрифт хотите заменить?");
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        char start = '(';
        char end = ')';
        for(int i=0; i<args[1].length();++i) {
            if(args[1].charAt(i) == start){
                System.out.print(args[1].charAt(i));
                if(args[1].charAt(i+1)> 48 && args[1].charAt(i+1)< 58){
                    System.out.print(y);
                }
            }
            else if (args[1].charAt(i)< 48 || args[1].charAt(i) > 58){
                    System.out.print(args[1].charAt(i));
            }
        }
    }

    public void Work3(){
        Scanner in = new Scanner(System.in);
        maintext +=". (O)(C)(12)";
        maintext += in.nextLine();
        String args[] = maintext.split("[.]");
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }

    public void Work4() {
        String numbers = "";
        int sum = 0;
        for (int i = 0; i < maintext.length(); i++) {
            char c = maintext.charAt(i);
            if (c > 47 && c < 58) {
                sum = 0;
                numbers += c;
            }
            else{
                sum ++;
                if(sum == 1) {
                    numbers += " ";
                }
            }
        }
        System.out.println(numbers);
    }
}