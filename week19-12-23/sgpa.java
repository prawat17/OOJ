import java.util.Scanner;
import java.util.Arrays;

class SGPA {
    String usn, name;
    int[] credits;
    int[] marks;

    SGPA(String usn, String name, int[] credits, int[] marks) {
        this.usn = usn;
        this.name = name;
        this.credits = credits;
        this.marks = marks;
    }

    // Method to calculate SGPA
    public double calculateSGPA() {
        double totalCredits = 0.0;
        double weightedSum = 0.0;

        for (int i = 0; i < credits.length; i++) {
            totalCredits += credits[i];
            weightedSum += calculateGradePoints(marks[i]) * credits[i];
        }

        return weightedSum / totalCredits;
    }

    private double calculateGradePoints(int marks) {
        if (marks >= 90) {
            return 10.0;
        } else if (marks >= 80) {
            return 9.0;
        } else if (marks >= 70) {
            return 8.0;
        } else if (marks >= 60) {
            return 7.0;
        } else if (marks >= 50) {
            return 6.0;
        } else if (marks >= 40) {
            return 5.0;
        } else {
            return 0.0;
        }
    }

    public void accept(Scanner in) {
        System.out.println("Enter 8 credits:");
        for (int i = 0; i < 8; i++) {
            credits[i] = in.nextInt();
        }

        System.out.println("Enter 8 marks:");
        for (int i = 0; i < 8; i++) {
            marks[i] = in.nextInt();
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Initialize arrays for credits and marks
        int[] creditsArray = new int[8];
        int[] marksArray = new int[8];

        SGPA nav = new SGPA("123", "Navneeth KS", creditsArray, marksArray);
        nav.accept(scanner); // Pass the Scanner object to the accept method
        System.out.println("Marks array: " + Arrays.toString(nav.marks));
        System.out.println("SGPA: " + nav.calculateSGPA());
    }
}
