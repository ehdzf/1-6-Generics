package leveltwo.taskone;

import levelone.tasktwo.Person;

public class PersonWithMessage extends Person {
    public PersonWithMessage(String name, String surename, int age) {
        super(name, surename, age);
    }

    public void printPersonWithMessage() {
        GenericMethodsWithNonGenericAttributes.print(this.getName(), "My name is: ");
        GenericMethodsWithNonGenericAttributes.print(this.getSurename(), "My surename is: ");
        GenericMethodsWithNonGenericAttributes.print(this.getAge(), "My age is: ");
    }
}
