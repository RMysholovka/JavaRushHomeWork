package com.javarush.test.level04.lesson07.task03;

/**
 * Created by user on 05.05.2016.
 */


/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int n;
        int n1 = abs(a);
        int n2 = abs(b);
        int n3 = abs(c);
        n = n1 + n2 + n3;
        System.out.println(n);
    }
    public static int abs(int a){
        if (a >= 0){return 1;}
        else{return 0;}





    }
}