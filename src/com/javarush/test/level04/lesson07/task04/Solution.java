package com.javarush.test.level04.lesson07.task04;

/**
 * Created by user on 06.05.2016.
 */
/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        int k;
        int k1 = abs(a);
        int k2 = abs(b);
        int k3 = abs(c);
        k = k1 + k2 + k3;
        int d = 3 - k;
        System.out.println("количество отрицательных чисел: " + d);
        System.out.println("количество положительных чисел: " + k);
    }
//yutty
    public static int abs(int a){
        if(a>=0){return 1;}
        else {return 0;}


    }
}