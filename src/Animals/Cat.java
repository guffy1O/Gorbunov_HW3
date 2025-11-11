package Animals;

public class Cat extends Animal implements Runnability
{
    private static int catCount = 0;
    private final String name;

    public Cat(String name)
    {
        super();
        this.name = name;
        catCount++;
    }

    @Override
    public void run(int distance)
    {
        if (distance <= 200)
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
        System.out.printf("%s не умеет плавать!\n", name);
    }

    public static int getCatCount()
    {
        return catCount;
    }
}