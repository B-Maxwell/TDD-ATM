import java.util.Scanner;

/**
 * Created by Ben Maxwell on 2/17/17.
 */
public class ATM {

    String name;
    double balance;
    double withdrawAmt;
    double depositAmt;

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setWithdrawAmt(double withdrawAmt) {
        this.withdrawAmt = withdrawAmt;
    }

    public void setDepositAmt(double depositAmt) {
        this.depositAmt = depositAmt;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawAmt() {
        return withdrawAmt;
    }

    public double getDepositAmt() {
        return depositAmt;
    }
}
