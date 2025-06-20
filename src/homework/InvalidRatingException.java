package homework;

public class InvalidRatingException extends Exception {

    public InvalidRatingException(int rating) {
        super("Рейтинг должен быть от 1 до 5");
    }
}
