package levelthree;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        Generic.usePhoneMethods(smartPhone);
        Generic.useSmartPhoneMethods(smartPhone);
    }
}
