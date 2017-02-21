import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ben Maxwell on 2/17/17.
 */

public class ATMTest {

    @Test
    public void checkUserNameInput() {
        //Assemble ATM object
        ATM atm = new ATM();
        //Allow user to enter a name when prompted
        atm.setName("Ben");
        assertTrue(!atm.name.isEmpty());
        System.out.println("Welcome, " + atm.getName() + "!");

    }

    @Test
    public void checkForNullName() {
        //Assemble ATM object
        ATM atm = new ATM();
        //Set a null value for name
        atm.setName("");
        assertTrue(atm.name.isEmpty());
        if (atm.name.isEmpty()) {
            System.out.println("Name cannot empty");
        }

    }


    @Test
    public void withdrawFunds() {
        ATM atm = new ATM();
        atm.setBalance(100);
        atm.setWithdrawAmt(50);
        atm.setBalance(atm.balance - atm.withdrawAmt);
        assertTrue(atm.balance < 100);

    }

    @Test
    public void overdrawFunds() {
        ATM atm = new ATM();
        atm.setBalance(100);
        atm.setWithdrawAmt(150);
        assertTrue(atm.balance < atm.withdrawAmt);
        if (atm.balance < atm.withdrawAmt) {
            System.out.println("Insufficient funds available");
        }
    }

    @Test
    public void depositFunds() {
        ATM atm = new ATM();
        atm.setBalance(100);
        atm.setDepositAmt(150);
        atm.setBalance(atm.balance + atm.depositAmt);
        assertTrue(atm.balance > 100);

    }
}





