package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //System.out.println("Введите номер дня недели: ");
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String number = reader.readLine();
        int number1 = Integer.parseInt(number);
        if(number1==1)
            System.out.println("понедельник");
        else
            if(number1==2)
                System.out.println("вторник");
        else
                if(number1==3)
                    System.out.println("среда");
        else
                    if(number1==4)
                        System.out.println("четверг");
        else
                        if(number1==5)
                            System.out.println("пятница");
        else
                            if(number1==6)
                                System.out.println("субота");
        else
                                if(number1==7)
                                    System.out.println("воскресенье");
        else System.out.println("такого дня недели не существует");


    }

}