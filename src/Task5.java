public class Task5 {
/*
    Задача 5
    Необходимо написать программу учёта сотрудников какой-либо компании.

    Программа должна содержать класс «Сотрудник»,
    который будет включать в себя все основные необходимые поля и методы.
        Например: имя, возраст, должность и методы получения информации о сотруднике,
    а также метод, который выводит количество созданных объектов-сотрудников.

    Также программа должна содержать класс сотрудника по занимаемой им должности.
    Например, «Водитель» с хотя бы одним своим полем (к примеру, марка автомобиля), унаследованный от класса «Сотрудник».

    В методе Main необходимо создать хотя бы по одному экземпляру каждого
    из классов и вывести информацию о каждом на консоль:
    поля класса «Сотрудник» (имя, возраст…) + поля класса «Водитель» (марка автомобиля)
    посредством одного метода.
    А также вывести счетчик количества созданных объектов.

    Образец вывода:


*/

    public static void main(String[] args) {


Worker worker = new Worker("Vasja", 35, "Newbie");
        //сотрудник = новый Сотрудник
    Driver driver = new Driver("Gena", 25);

        Worker worker1 = new Worker("Philipp", 35, "Newbie");
    //Водитель водитель = новый Водитель
    //
    Driver driver1 = new Driver("Ira", 45);
        Driver driver2 = new Driver("Ira", 45);
        Driver driver3 = new Driver("Nelson", 45);
        Driver driver4 = new Driver("Pippin", 18);


//Сотрудник сотрудник = новый Водитель (программа компилируется)
    //driver = new Worker("Ivan", 20, "Driver"); // новый Сотрудник (компилятор выдает ошибку)
        System.out.println("Workers count: " + worker.getObject_count());
        System.out.println("Drivers count: "+ driver.getObject_count());

//Счетчик созданных объектов = 3

}
}