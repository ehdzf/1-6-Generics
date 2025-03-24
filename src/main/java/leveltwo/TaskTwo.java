package leveltwo;

import leveltwo.taskone.GenericMethodsWithNonGenericAttributes;
import leveltwo.taskone.PersonWithMessage;

import java.util.ArrayList;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        List<PersonWithMessage> list = new ArrayList<>();
        PersonWithMessage person1 = new PersonWithMessage("John", "Doe", 25);
        PersonWithMessage person2 = new PersonWithMessage("Jane", "Doe", 25);
        PersonWithMessage person3 = new PersonWithMessage("Chuck", "Norris", 25);
        list.add(person1);
        list.add(person2);
        list.add(person3);

        GenericMethodsWithNonGenericAttributes.print(list, "The list of persons is: \n");
    }
}
