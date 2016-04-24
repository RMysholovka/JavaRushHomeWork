package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String number = reader.readLine();
        int number1 = Integer.parseInt(number);
        if(number1>0)
            number1  = number1*2;
        else
            number1++;
        System.out.println(number1);
    }

}