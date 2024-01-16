import java.util.*;

class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        Account a = new Cur("Navneeth",1001,20000);
        Account a1 = new Sav("Pranav",1002,10000);
        opt(a);
        
        
        
    }
    public static void opt(Account s){
        int choice;
        do {
            System.out.println("Options:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compound");
            System.out.println("4. Cheque");
            System.out.println("5. Details");
            System.out.println("6. Penalty");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
               
                case 1:
                    System.out.print("Enter deposit amount: ");
                    float amtDeposit = in.nextFloat();
                    s.deposit(amtDeposit);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    float amtWithdraw = in.nextFloat();
                    float withdrawnAmount = s.withdraw(amtWithdraw);
                    System.out.println("Amount withdrew is: " + withdrawnAmount);
                    break;

                case 3:
                    System.out.print("Enter number of years for compound interest: ");
                    int years = in.nextInt();
                    System.out.println("The compound is: " + s.compound(years));
                    break;
                
                case 4:
                    System.out.print("Enter amount: ");
                    float amt = in.nextFloat();
                    s.depositCheque(amt);
                    break;

                case 5:
                    s.details();
                    break;
                
                case 6:
                    s.penalty();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 7);
    }
}

abstract class Account {
    String name;
    int accno;

    Account(String name, int accno) {
        this.name = name;
        this.accno = accno;
    }

    abstract void deposit(float amount);

    abstract float withdraw(float withdraw);

    abstract float compound(int years);

    abstract void details();

    abstract void depositCheque(float amount);

    abstract void penalty();
}

class Sav extends Account {
    float balance = 0.0f;

    Sav(String name, int accno, float initialBalance) {
        super(name, accno);
        this.balance = initialBalance;
    }

    void deposit(float amount) {
        balance += amount;
    }

    float withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
            return amount;
        } else {
            System.out.println("Insufficient bank balance");
            return 0.0f;
        }
    }

    float compound(int years) {
        return balance * (float) Math.pow(1.08, years);
    }
   
    float penalty() {
        System.out.println("Invalid methods\n");
        return 0;
    }

    void details() {
        System.out.println("Name: " + name + ", AccNo: " + accno + ", Balance: " + balance);
    }
    void depositCheque(float amount) {
        System.out.println("Invalid methods\n");
        return;
    }
}

   

class Cur extends Account {
    float balance = 0.0f;
    float min;

    Cur(String name, int accno, float min) {
        super(name, accno);
        this.min = min;
    }
    void deposit(float amount) {
        depositCheque(amount);
    }

    void depositCheque(float amount) {
        balance += amount;
    }

    float withdraw(float amount) {
        balance -= amount;
        return amount;
    }

    void details() {
        System.out.println("Name: " + name + ", AccNo: " + accno + ", Balance: " + balance);
    }
   
    float compound(int years) {
        System.out.println("Invalid methods\n");
        return 0;
       
    }

    void penalty() {
        if (balance < min) {
            System.out.println("Insufficient balance, penalty of 1000 added");
        } else {
            System.out.println("Proper balance");
        }
    }
}
