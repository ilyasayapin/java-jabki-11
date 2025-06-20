package homework;

public class NegativeDepositException extends Exception {

    public NegativeDepositException(double amount) {
        super("Нельзя внести отрицательную сумму: " + amount);
    }
}
