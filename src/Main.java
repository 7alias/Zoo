public class Main {


    /*public static void main(String[] args) {
        Object animal = new Object();
        Cat cat = new Cat();

Zoo zoo = new Zoo();
        zoo.change(new PopcornStall(), 1);

        zoo.print();
        animal = new Cat();
        System.out.println(animal);

    }*/

    public static void main(String[] args) {

        Barracks barracks = new Barracks();
        barracks.add(new Soldier("Пехотинец"));
        barracks.add(new Knight("Рыцарь"));
        barracks.add(new Rifleman("Мушкетер"));

        barracks.visit();
    }

}