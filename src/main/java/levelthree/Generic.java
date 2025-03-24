package levelthree;

public class Generic {
    public static <T extends Phone> void usePhoneMethods(T object) {
        System.out.println("Using the methods included in the Phone interface");
        object.call();
    }

    public static <T extends SmartPhone> void useSmartPhoneMethods(T object) {
        System.out.println("Using the methods included in the SmartPhone class");
        object.call();
        object.takePicture();
    }
}
