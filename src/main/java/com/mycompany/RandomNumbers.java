import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получаем размер массива от пользователя
        int n;
        do {
            System.out.print("Введите размер массива (целое положительное число): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Некорректный ввод. Введите целое положительное число: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        // Получаем значение порога от пользователя
        int x = Integer.MIN_VALUE;
        do {
            System.out.print("Введите значение порога (целое число): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Некорректный ввод. Введите целое число: ");
                scanner.next();
            }
            x = scanner.nextInt();
        } while (x == Integer.MIN_VALUE);

        // Создаем массив случайных чисел
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100); // Генерируем случайное число от 0 до 99
        }

        // Выводим массив на экран
        System.out.print("Массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Находим индексы элементов, превосходящих порог
        System.out.print("Индексы элементов, превосходящих порог " + x + ": ");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] > x) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("Нет элементов, превосходящих порог.");
        }
        System.out.println();
    }
}