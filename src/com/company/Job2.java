package com.company;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;


public class Job2 {
    private String maintext = "01 Левченко 12000.03 Толстой 434000.04 Городецкий 32000.02 Артемьев 4530";
    private String sentence[] = maintext.split("[.]");

    public Job2(){ }

    public void OutStence(){
        for (int i = 0; i < sentence.length; ++i){ //вывод отсортированного массива
            System.out.println(sentence[i]);
        }
    }

    public void SortStence(){
        for(int i =0; i < sentence.length; i++){ //сортировка по куда(код двоичное число)
            for(int j = i+1; j <sentence.length; j++){
                if((sentence[i].charAt(0)+sentence[i].charAt(1))>(sentence[j].charAt(0)+sentence[j].charAt(1))){
                    String g = sentence[i];
                    sentence[i] = sentence[j];
                    sentence[j] = g;
                }
            }
        }
    }

    public void Work1(){
        sentence = Arrays.copyOf(sentence, sentence.length+1);
        for(int i =0; i < sentence.length; i++){
            if(i == sentence.length-1){
                sentence[i] = "23 Кудрявцев 3243";
            }
        }
    }

    public void Work2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите код сотрудника который хотите удалить:");
        int y;
        while (true){
            y=in.nextInt();
            if(y > 99){
                System.out.println("Вы ввели число больше двухзначного");
            }
            else
            {
                break;
            }
        }
        int num = y+48+48;
        if(y > 10){
            num = 48 + y%10 + 48 + y/10;
        }
        System.out.println();
        for(int i = 0; i < sentence.length; i++){
            if((sentence[i].charAt(0)+ sentence[i].charAt(1)) == num){
                for (int j = i+1; j < sentence.length; j++){
                    sentence[i]=sentence[j];

                }
                sentence = Arrays.copyOf(sentence, sentence.length-1);
            }
        }
    }

    public void Work3(){
        for (int i = 0; i < sentence.length; i++){
           StringBuffer name1 = new StringBuffer(sentence[i]);
           name1.insert(2,"000");
            System.out.println(name1);
        }

    }
}
