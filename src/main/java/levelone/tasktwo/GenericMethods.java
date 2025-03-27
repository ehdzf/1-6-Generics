package levelone.tasktwo;

public class GenericMethods {
    public static <T> void print(T object) {
        String type = object.getClass().getSimpleName();
        System.out.println("Value: " + object + " is of type: " + type);
    }
}
