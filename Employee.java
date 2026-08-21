class Employee {

    private int empId;
    private String name;
    private String department;

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

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setName("Diya");
        emp.setDepartment("IT");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
    }
}
