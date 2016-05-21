package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        CurrentDate date = new CurrentDate(21, 5, 2016);
        System.out.println(date.day + " " +"0"+ date.munth + " " + date.year);
        //System.out.println("21 05 2016");

    }

    public static class CurrentDate
    {

        int day;
        int munth;
        int year;

        public CurrentDate(int day, int munth, int year)
        {
            this.day = day;
            this.munth = munth;
            this.year = year;
        }
    }
}
