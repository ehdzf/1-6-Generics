package levelone;

import levelone.taskone.NoGenericMethods;

public class TaskOne {
    public static void main(String[] args) {
        NoGenericMethods noGenericMethods = new NoGenericMethods("Tomate", "Pimiento", "Patata");
        System.out.println(noGenericMethods);
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("Pimiento", "Patata", "Tomate");
        System.out.println(noGenericMethods2);
    }
}
