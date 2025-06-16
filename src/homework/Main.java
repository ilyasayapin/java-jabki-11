package homework;

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
    }


}
