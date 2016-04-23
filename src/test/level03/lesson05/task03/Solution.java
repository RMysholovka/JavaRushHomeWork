package test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{

    public static int convertToSeconds(int hour){
        int second = hour * 3600;
        return second;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(24) );
        System.out.println(convertToSeconds(68) ); //напишите тут ваш код
    }
}