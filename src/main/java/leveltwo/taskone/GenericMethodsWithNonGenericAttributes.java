package leveltwo.taskone;


import java.util.List;

public class GenericMethodsWithNonGenericAttributes {
    public static <T> void print(T object, String message) {
        System.out.println(message + object);
    }

    public static <T> void print(List<T> object, String message) {
        System.out.println(message + object);
    }
}
