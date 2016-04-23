package test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("Введите Имя: "); //напишите тут ваш код
        String name = reader.readLine();
        //System.out.println("Введите сумму денег: ");
        String cash = reader.readLine();
        int ncash = Integer.parseInt(cash);
        //System.out.println("Введите период: ");
        String year = reader.readLine();
        int nyear = Integer.parseInt(year);
        System.out.println(name + " получает "+ncash+" через "+nyear+" лет.");

    }
}