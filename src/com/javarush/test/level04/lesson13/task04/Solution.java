package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int m = 1; m <=11; m++)
        {

            for (int n = 1; n<=10; n++ )
            {
               if(m==1||n==1) System.out.print("8");
            }
            System.out.println();
        }
    }
}
