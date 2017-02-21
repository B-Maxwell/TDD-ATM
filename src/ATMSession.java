import java.util.Scanner;

/**
 * Created by Ben Maxwell on 2/21/17.
 */
public class ATMSession {

    ATM atm = new ATM();
    Scanner input = new Scanner(System.in);


    public void enterName() throws Exception {

        System.out.println("Please enter your name: ");
        atm.setName(input.nextLine());

        if (atm.name.isEmpty()) {
            throw new Exception("Please enter a name! Input cannot be blank");
        } else {
            System.out.println("\nWelcome, " + atm.name + "!");
        }
    }

    public void setBalance() {
        atm.setBalance(100);
    }

    public void enterChoice() throws Exception {
        System.out.println("\nHow can we serve you today? (Please select an option 1 -3) \n1. Check Balance \n2. Withdraw Funds \n3. Deposit Funds \n4. Cancel");
        int option = input.nextInt();


        switch (option) {

            case 1: //Checks Balance
                System.out.println("Your current balance is " + atm.getBalance());
                break;

            case 2: //Makes withdrawal
                System.out.println("\nHow much would you like to withdraw?");
                atm.setWithdrawAmt(input.nextInt());


                if (atm.withdrawAmt > atm.getBalance()) {
                    System.out.println("Sorry, you currently do not enough funds to withdraw that amount.");
                } else {
                    atm.setBalance(atm.balance - atm.withdrawAmt);
                    System.out.println("\nPlease take your funds from the machine. Your new balance is " + atm.getBalance());
                }

                break;

            case 3: //Makes deposit
                System.out.println("\nHow much would you like to deposit?");
                atm.setDepositAmt(input.nextInt());
                atm.setBalance(atm.balance + atm.depositAmt);
                break;

            case 4: //Exits session
                System.out.println("\nThank you " + atm.getName() + ". Please come again!");
                System.exit(0);
                break;

            default: //Throws exception
                throw new Exception("\nInvalid option. Please select an option 1 - 4");
        }
    }

}
