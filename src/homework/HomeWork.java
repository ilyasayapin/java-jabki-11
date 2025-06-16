package homework;

import coffee.NoWaterException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HomeWork {

    // 1. Безопасное деление
    public static Integer safeDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено");
            return null;
        }
    }

    // 2. Проверка строки
    public static void validateString(String str) {
        if (str.isBlank()) {
            throw new IllegalArgumentException("Строка пустая или состоит только из пробелов");
        } else {
            System.out.println("Строка годится для работы с ней");
        }
    }

    // 3. Преобразование строки в число
    public static List<Integer> convertStrToNum(List<String> str) {
        List<Integer> newList = new ArrayList<>();
        for (String s : str) {
            try {
                newList.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.printf("Строка %s не может быть преобразована в число", s);
                System.out.println();
            }
        }
        return newList;
    }

    // 4. Простая валидация возраста
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        } else {
            System.out.println("Возраст установлен: " + age);
        }
    }

    // 5. Собственное исключение: депозит
    public static void deposit(double amount) {
        try {
            if (amount < 0) {
                throw new NegativeDepositException(amount);
            }
            System.out.println("Внесено на депозит: " + amount);
        } catch (NegativeDepositException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // 6. Поиск товара по коду
    private static final Map<String, String> itemsMap = Map.of(
            "A1", "Книга",
            "B2", "Тетрадь",
            "C3", "Ручка"
    );

    public static void getItem(String code) {
        try {
            if (!itemsMap.containsKey(code)) {
                throw new ItemNotFoundException(code);
            }
            System.out.printf("Код: %s; Товар: %s", code, itemsMap.get(code));
            System.out.println();
        } catch (ItemNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


}
