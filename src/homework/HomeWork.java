package homework;

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


}
