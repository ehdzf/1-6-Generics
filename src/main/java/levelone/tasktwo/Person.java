package levelone.tasktwo;

public class Person {
    private final String name;
    private final String surename;
    private final int age;

    public Person(String name, String surename, int age) {
        this.name = name;
        this.surename = surename;
        this.age = age;
    }

    public void printPerson() {
        GenericMethods.print(this.name);
        GenericMethods.print(this.surename);
        GenericMethods.print(this.age);
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", age=" + age +
                '}';
    }
}
