import java.util.*;

class Amount {
    int acc_no;
    String name;
    float amount;

    void getdata(int a, String n, float amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    void deposit(Float amt) {
        amount = amount + amt;
        System.out.println(amt + " Deposited");
    }

    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + "Withdrawn");
        }
    }

    void checkbalance() {
        System.out.println("Balance" + amount);
    }

    void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}

public class testaccount {
    public static void main(String[] agrs) {
        Amount a1 = new Amount();
        a1.getdata(9832, "Tripti", 2000);
        a1.display();
        a1.checkbalance();
        a1.withdraw(1000);
        a1.checkbalance();
        a1.deposit(100.0f);
        a1.checkbalance();
    }
}
