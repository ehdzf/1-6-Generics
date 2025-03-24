package leveltwo;

import leveltwo.taskone.PersonWithMessage;

public class TaskOne {
    public static void main(String[] args) {
        PersonWithMessage person = new PersonWithMessage("John", "Doe", 25);
        person.printPersonWithMessage();
    }
}
