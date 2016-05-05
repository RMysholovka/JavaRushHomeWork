package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String number1 = reader.readLine();
        int a = Integer.parseInt(number1);

        String number2 = reader.readLine();
        int b = Integer.parseInt(number2);

        String number3 = reader.readLine();
        int c = Integer.parseInt(number3);

        String number4 = reader.readLine();
        int d = Integer.parseInt(number4);

        if (a > b && a > c && a > d)
            System.out.println(a);
       else if (b > c && b > d && b > a)

            System.out.println(b);
        else if (c > a && c > b && c > d)
            System.out.println(c);
        else
            System.out.println(d);

    }
}
