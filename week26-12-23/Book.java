import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private double price;
    private int numPages;

    // Constructor to set the values for the members
    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    // Methods to set and get the details of the objects
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    // toString() method to display the complete details of the book
    public String toString() {
    String n = "\n" + "Name of Book: " + name + "\n";
    String a = "Author of Book: " + author + "\n";
    String p = "Price of Book: Rs" + price + "\n";
    String N = "Number of pages: " + numPages + "\n";
    return n + a + p + N;
}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();

        // Create an array to store n book objects
        Book[] books = new Book[n];

        // Input details for each book
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Author: ");
            String author = scanner.next();
            System.out.print("Price: Rs");
            double price = scanner.nextDouble();
            System.out.print("Number of Pages: ");
            int numPages = scanner.nextInt();

            // Create a book object with the input details
            books[i] = new Book(name, author, price, numPages);
        }

        // Display details of each book
        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1) + " Details:\n" + books[i].toString());
        }

        scanner.close();
    }
}
