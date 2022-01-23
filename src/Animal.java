abstract public class Animal extends Object {
    public void print(){
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "I am an Animal";
    }
}
