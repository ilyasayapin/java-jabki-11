package homework;

public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException(String code) {
        super("Код не найден в карте товаров: " + code);
    }
}
