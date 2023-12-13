package task1;

public class Cat extends Animal{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void makeSound() {
        System.out.printf("%s meows!\n", name);
    }

}
