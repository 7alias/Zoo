public class PopcornStall extends Object implements Soundable{

    public void print(){
        System.out.println(this);
    }

    @Override
    public void sound() {
        System.out.println("Taste a better popcorn here!");
    }

    @Override
    public String toString() {
        return "It's popcorn stall";
    }
}
