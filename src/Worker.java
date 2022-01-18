public class Worker {
 private String name;
 private int age;
 private static int object_count = 0;
 private String position;




    public Worker(String name, int age, String position) {
        this.name = name;
        this.age = age;
        object_count+=1;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getObject_count() {
        return this.object_count;
    }

    public String getPosition() {
        return position;
    }


    }
