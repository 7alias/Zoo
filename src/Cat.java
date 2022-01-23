public class Cat extends Mammal implements Soundable{
    public void print(){
        System.out.println(this);
    }

    @Override
    public void sound()
    {
        System.out.println("Meow");}

    @Override
    public String toString() {
        return "I am a Cat";
    }
}