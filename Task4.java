
public class Task4 {
    public static void main(String[] args) {

        Account acc = new Account(111, 200);
        CheckingAccount chAccount = new CheckingAccount(112, 250);
        SavingAccount savAccount = new SavingAccount(113, 300);

        System.out.println(acc);
        System.out.println(chAccount);
        System.out.println(savAccount);
    }

}
