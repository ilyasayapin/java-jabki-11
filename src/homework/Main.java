package homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Безопасное деление
        System.out.println("Безопасное деление: " + HomeWork.safeDivide(0, 1));

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




    }




}
