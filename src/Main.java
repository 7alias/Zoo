public class Main {


    public static void main(String[] args) {
        Object animal = new Object() {
        };


        Zoo zoo = new Zoo();
        zoo.change(new PopcornStall(), 4);


        zoo.sound();
        zoo.print();

    }
}