package homework;

public class LoginFailedException extends Exception {

    public LoginFailedException() {
        super("Неверный логин или пароль");
    }
}