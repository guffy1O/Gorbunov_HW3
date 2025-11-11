
import Animals.*;
import Employee.*;

public class Main
{
    public static void main(String[] args)
    {
        exercise1();
        exercise2();
    }


    public static void exercise1()
    {
        Cat barsik = new Cat("Барсик");
        Dog bobik = new Dog("Бобик");

        barsik.run(150);
        bobik.run(400);
        barsik.swim(5);
        bobik.swim(8);

        System.out.println("\nКоличество кошек: " + Cat.getCatCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Всего животных: " + Animal.getTotalAnimals()); // Общий счётчик
    }

    public static void exercise2()
    {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Минерва Макгонагалл", "Зам. директора", "meowgonagall@hogwarts.uk",
                "+79111111111", 120000, 62);
        employees[1] = new Employee("Альбус Дамблдор", "Директор", "boss@hogwarts.uk",
                "+79222222222", 150000, 115);
        employees[2] = new Employee("Северус Снегг", "Учитель", "notatraitor@hogwarts.uk",
                "+79333333333", 70000, 38);
        employees[3] = new Employee("Рубеус Хагрид", "Лесничий", "lovefluffy@hogwarts.uk",
                "+79444444444", 70000, 70);
        employees[4] = new Employee("Сивилла Трелони", "Учитель", "youhavegream@hogwarts.uk",
                "+79555555555", 65000, 36);


        Employee.printTableHeader();

        for (Employee employee : employees)
        {
            if (employee.getAge() > 40)
            {
                employee.displayInfo();
            }
        }
    }

}