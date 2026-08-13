public class Student {
    

    String name;
    int rollNo;
    char grade;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Diya";
        student1.rollNo = 101;
        student1.grade = 'A';

        Student student2 = new Student();
        student2.name = "Riya";
        student2.rollNo = 102;
        student2.grade = 'B';

        student1.displayInfo();
        student2.displayInfo();
    }
}

