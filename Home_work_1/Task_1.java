//Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
//Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
//Sample Input:
//8
//11
//Sample Output:
//512
//1331

import java.util.Scanner;

public class Task_1 {

public static void main(String[] args) {

        int[] cubes = new int[1000];
        for (int i = 0; i < 1000; i++) {
                cubes[i] = (i+1)*(i+1)*(i+1);
        }

    // Вводим два числа из диапазона
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

    // Находим кубы чисел a и b
        int cubeA = 0;
        int cubeB = 0;
        for (int i = 0; i < 1000; i++) {
            if (i+1 == a) {
                cubeA = cubes[i];
            }
        if (i+1 == b) {
                cubeB = cubes[i];
        }
    }

    // Выводим результаты
        System.out.println("Куб числа " + a + " равен " + cubeA);
        System.out.println("Куб числа " + b + " равен " + cubeB);
    }
}