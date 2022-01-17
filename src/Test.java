public class Test {
    public static void main(String args[]) {

        Object c = new Cat();
        Object r = new Reptile();
        Object d = new Dog();

        System.out.println(c instanceof Object);
        System.out.println(r instanceof Mammal);
        System.out.println(d instanceof Dog);
        d.print();
        r.print();
        c.print();
    }
}
