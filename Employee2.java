public class Employee2 {

    private int empId;
    private String name;
    private String department;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Invalid salary. Salary cannot be negative.");
            this.salary = 15000.0;
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Employee2 emp = new Employee2();

        emp.setEmpId(101);
        emp.setName("Diya");
        emp.setDepartment("IT");

        emp.setSalary(25000.0);
        System.out.println("Valid Salary: " + emp.getSalary());

        emp.setSalary(-5000.0);
        System.out.println("Salary after invalid input: " + emp.getSalary());
    }
}