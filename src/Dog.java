public class Dog extends Mammal {
    public void print() {
        System.out.println(this);
    }


    public void evolute() {
        Zoo zoo = new Zoo();
        zoo.print();
        super.print();
    }

    @Override
    public String toString() {
        return "I am a Dog";
    }
}
