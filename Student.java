

public class Student {
    // Instance variables
    String name;
    String department;
    int age;

    // Constructor
    public Student(String name, String dep, int age) {
        this.name = name;
        this.department = dep;
        this.age = age;
    }

    // Method to print student details
    public void displayInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Age: " + this.age);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of Student class
        Student s1 = new Student("Varun", "Computer Science", 20);

        // Calling the method
        s1.displayInfo();
    }
}