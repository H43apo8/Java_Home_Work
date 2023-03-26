/*Task_3.
Реализовать простой калькулятор (+,-,=,*), только с целыми числами. */

import java.util.Scanner;
public class Task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Некорректная операция!");
                return;
        }
        System.out.println("Результат: " + result);
    }
}