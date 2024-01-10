import java.util.*;

abstract class AbsArea {
    int a, b;

    AbsArea(int x) {
        a = x;
    }

    AbsArea(int x, int y) {
        a = x;
        b = y;
    }

    abstract void area();
}

class rec extends AbsArea {
    rec(int a, int b) {
        super(a, b);
    }

    void area() {
        System.out.println("The area of the rectangle is: " + a * b);
    }
}

class tri extends AbsArea {
    tri(int a, int b) {
        super(a, b);
    }

    void area() {
        System.out.println("The area of the triangle is: " + (a * b) / 2);
    }
}

class cir extends AbsArea {
    cir(int a) {
        super(a);
    }

    void area() {
        System.out.println("The area of the circle is: " + 3.14 * a * a);
    }
}

class Main {
    public static void main(String args[]) {
	System.out.println("This is the work of Navneeth KS\n1BM22CS174");
        int x, y;
        Scanner n = new Scanner(System.in);

        // Input for rectangle dimensions (x and y) with validation
        System.out.println("Give input for rectangle");
        x = n.nextInt();
        y = n.nextInt();
        if (x < 0 || y < 0) {
            System.out.println("Invalid input for rectangle. Please enter positive values.");
            // You might want to handle this situation differently, such as asking the user to enter values again.
            System.exit(1); // Exiting with status code 1 (indicating abnormal exit)
        }

        AbsArea r = new rec(x, y);
        r.area();

        // Input for triangle dimensions (x and y) with validation
        System.out.println("Give input for triangle");
        x = n.nextInt();
        y = n.nextInt();
        if (x < 0 || y < 0) {
            System.out.println("Invalid input for triangle. Please enter positive values.");
            System.exit(1);
        }

        AbsArea t = new tri(x, y);
        t.area();

        // Input for circle radius (x) with validation
        System.out.println("Give input for circle");
        x = n.nextInt();
        if (x < 0) {
            System.out.println("Invalid input for circle. Please enter a positive value.");
            System.exit(1);
        }

        AbsArea c = new cir(x);
        c.area();
    }
}
