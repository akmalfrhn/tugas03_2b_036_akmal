package id.ac.polban.model;

public class Employee {
    private int id;
    private String name;
    private Department department;
    private EmploymentType type;
    private double salary;

    private static double MINIMUM_SALARY = 3000000;

    public Employee(int id, String name, Department department, EmploymentType type, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.type = type;
        this.salary = (salary < MINIMUM_SALARY) ? MINIMUM_SALARY : salary;
    }

    public static double getMinimumSalary() {
        return MINIMUM_SALARY;
    }

    public static void setMinimumSalary(double minSalary) {
        MINIMUM_SALARY = minSalary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    public EmploymentType getType() { return type; }
    public void setType(EmploymentType type) { this.type = type; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = (salary < MINIMUM_SALARY) ? MINIMUM_SALARY : salary; }
}
