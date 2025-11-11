package Animals;


public class Animal implements Runnability, Swimmability
{
    private static int totalAnimals = 0;

    public Animal()
    {
        totalAnimals++;
    }

    public static int getTotalAnimals()
    {
        return totalAnimals;
    }


    @Override
    public void run(int distance) {}


    @Override
    public void swim(int distance) {}
}