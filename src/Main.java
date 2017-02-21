public class Main {

    public static void main(String[] args) throws Exception {
        ATMSession session = new ATMSession();

        session.setBalance();
        session.enterName();

        while (true) {
            session.enterChoice();
        }
    }
}
