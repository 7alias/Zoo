abstract public class Animal {
    public void print(){
        System.out.println(this);
    }
    abstract public void sound();

    @Override
    public String toString() {
        return "I am an Animal";
    }
}
