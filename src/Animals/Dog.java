package Animals;

public class Dog extends Animal implements Runnability, Swimmability
{
    private static int dogCount = 0;
    private final String name;

    public Dog(String name)
    {
        super();
        this.name = name;
        dogCount++;
    }

    @Override
    public void run(int distance)
    {
        if (distance <= 500)
        {
            System.out.printf("%s пробежал %d м.\n", name, distance);
        }

        else
        {
            System.out.printf("%s не смог пробежать такое расстояние!\n", name);
        }
    }

    @Override
    public void swim(int distance)
    {
        if (distance <= 10)
        {
            System.out.printf("%s проплыл %d м.\n", name, distance);
        }

        else
        {
            System.out.printf("%s не смог проплыть такое расстояние!\n", name);
        }
    }

    public static int getDogCount()
    {
        return dogCount;
    }
}