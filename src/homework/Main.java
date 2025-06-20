package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Безопасное деление
        HomeWork.safeDivide(1, 0);
        System.out.println("Безопасное деление: " + HomeWork.safeDivide(10, 5));

        // 2. Проверка строки
        try {
            HomeWork.validateString("  ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            HomeWork.validateString("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            HomeWork.validateString("Проверка");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 3. Преобразование строки в число
        System.out.println("Результат преобразования строк в числа: " + HomeWork.convertStrToNum(List.of("10", "abc", "5")));

        // 4. Простая валидация возраста
        try {
            HomeWork.setAge(-6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            HomeWork.setAge(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            HomeWork.setAge(7);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 5. Собственное исключение: депозит
        HomeWork.deposit(-6);
        HomeWork.deposit(1);

        // 6. Поиск товара по коду
        HomeWork.getItem("A3");
        HomeWork.getItem("B2");

        // 7. Чтение из файла
        List<String> lines = HomeWork.readFile("file.txt");

        // 8. Система логина
        HomeWork.login("admin", "12345");
        HomeWork.login("admin", "1234");

        // 9. Банковский перевод с валидацией
        double from = 10.0;
        double to = 5.0;
        try {
            double[] res = HomeWork.transfer(from, to, 3.0);
            from = res[0];
            to = res[1];
            HomeWork.transfer(from, to, 90.0);
        } catch (InvalidTransferAmountException | InsufficientBalanceException e) {
            System.out.printf("Ошибка: %s\n", e.getMessage());
        }
        try {
            HomeWork.transfer(from, to, 0.0);
        } catch (InvalidTransferAmountException | InsufficientBalanceException e) {
            System.out.printf("Ошибка: %s\n", e.getMessage());
        }
        try {
            HomeWork.transfer(from, to, -90.0);
        } catch (InvalidTransferAmountException | InsufficientBalanceException e) {
            System.out.printf("Ошибка: %s\n", e.getMessage());
        }
        System.out.printf("Баланс отправителя: %.2f%n", from);
        System.out.printf("Баланс получателя: %.2f%n%n", to);

        // 10. Сервис оценки товара
        try {
            System.out.println(HomeWork.rateProduct(3));
            System.out.println(HomeWork.rateProduct(6));
        } catch (InvalidRatingException e) {
            System.out.printf("Ошибка: %s", e.getMessage());
        }
    }
}

