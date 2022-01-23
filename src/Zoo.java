import java.util.Arrays;

public class Zoo {
    Object[] objects;

    public Zoo() {
        // в этой строке мы еще не создаем животных
        objects = new Object[4];
        // наполняем массив конкретными животными
        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new PopcornStall();
        objects[3] = new Reptile();
    }

    public void print() {
        // Используем цикл!
        // Каждое животное выводится по-своему!
        for (Object a : objects) {
            System.out.print(a + " ");
            if (a instanceof Soundable) {
                ((Soundable) a).sound();

            }
        }
    }

    public void sound() {
        // Используем цикл!
        // Каждое животное выводится по-своему!
        for (Object a : objects) {
            if (a instanceof Soundable) {
                ((Soundable) a).sound();

            }
        }
    }

    public void change(Object a, int i) {
        if (i >= 0 && i < objects.length)
            objects[i] = a;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(objects) +
                '}';
    }
}
