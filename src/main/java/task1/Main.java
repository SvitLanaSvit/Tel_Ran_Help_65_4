package task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Генерируем случайное целое число от 100 до 999
        Random rnd = new Random();
        int number = rnd.nextInt(900) + 100;

        // Находим самую большую цифру в числе
        int largestDigit = 0;
        int temp = number;
        while(temp > 0){
            int digit = temp % 10;
            if(digit > largestDigit){
                largestDigit = digit;
            }
            temp /= 10;
        }

        // Выводим число и его самую большую цифру
        System.out.println("The random number is " + number);
        System.out.println("The largest digit in the number is " + largestDigit);
    }
}
