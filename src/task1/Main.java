package task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Dog dog1 = new Dog("Barsik", 2);
        Cat cat1 = new Cat("Murzik", 5);
        Dog dog2 = new Dog("Benny", 6);
        Cat cat2 = new Cat("Leo", 3);

        Animal[] animals = new Animal[] {dog1, cat1, dog2, cat2};

        for (Animal animal : animals) {
            Field[] fields = animal.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                System.out.printf("%s:%s \n", field.getName(), field.get(animal));
            }
            System.out.println();
        }

        for (Animal animal: animals) {
            Method soundMethod = animal.getClass().getDeclaredMethod("makeSound");
            soundMethod.invoke(animal);
        }


    }
}