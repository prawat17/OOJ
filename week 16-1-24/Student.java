import java.util.Arrays;
import java.util.Scanner;

class Student {
    private int registrationNumber;
    private String fullName;
    private short semester;
    private float cgpa;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(int registrationNumber, String fullName, short semester, float cgpa) {
        this.registrationNumber = registrationNumber;
        this.fullName = fullName;
        this.semester = semester;
        this.cgpa = cgpa;
    }

    // Display method
    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }

    // Getter methods for testing
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public short getSemester() {
        return semester;
    }

    public float getCgpa() {
        return cgpa;
    }

    // Function to sort student records by CGPA
    public static void sortByCgpa(Student[] students) {
        Arrays.sort(students, (s1, s2) -> Float.compare(s2.getCgpa(), s1.getCgpa()));
    }

    // Function to sort student records by name
    public static void sortByName(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.getFullName().compareTo(s2.getFullName()));
    }

    public static void main(String[] args) {
        // Create an array of student records to store a minimum of 5 records
        Student[] students = new Student[5];

        // Input the records
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Registration Number: ");
            int regNum = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Full Name: ");
            String fullName = scanner.nextLine();
            System.out.print("Semester: ");
            short semester = scanner.nextShort();
            System.out.print("CGPA: ");
            float cgpa = scanner.nextFloat();

            students[i] = new Student(regNum, fullName, semester, cgpa);
        }

        // Display the records
        System.out.println("Student Records:");
        for (Student student : students) {
            student.display();
        }

        // Sort the records by CGPA and display
        sortByCgpa(students);
        System.out.println("Student Records sorted by CGPA:");
        for (Student student : students) {
            student.display();
        }

        // Sort the records by name and display
        sortByName(students);
        System.out.println("Student Records sorted by Name:");
        for (Student student : students) {
            student.display();
        }
    }
}
