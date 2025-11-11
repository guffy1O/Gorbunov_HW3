package Employee;

public class Employee
{
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;


    public Employee(String fullName, String position, String email,
                    String phoneNumber, double salary, int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


    public static void printTableHeader()
    {
        System.out.format("| %-20s | %-15s | %-25s | %-15s | %-10s | %-10s |\n",
                "ФИО", "Должность", "Email", "Телефон", "Зарплата", "Возраст");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }


    public void displayInfo()
    {
        System.out.format("| %-20s | %-15s | %-25s | %-15s | %-10s | %-10s |\n",
                fullName, position, email, phoneNumber, salary, age);
    }


    public int getAge()
    {
        return age;
    }
}