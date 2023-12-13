package task1;

public class Dog extends Animal{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void makeSound() {
        System.out.printf("%s barks!\n", name);
    }
}
