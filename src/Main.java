//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package Animals;

public class Main {
    public static void main(String[] args) {
        exercise1(); // Всё делаем в одной функции
    }
    public static void exercise1() {
        Cat barsik = new Cat("Барсик");
        Dog bobik = new Dog("Бобик");

        barsik.run(150);   // Барсик пробежит 150 метров
        bobik.run(400);    // Бобик пробежит 400 метров
        barsik.swim(5);    // Барсик не сможет плавать
        bobik.swim(8);     // Бобик проплывёт 8 метров

        System.out.println("\nКоличество кошек: " + Cat.getCatCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Всего животных: " + Animal.getTotalAnimals()); // Общий счётчик
    }
}