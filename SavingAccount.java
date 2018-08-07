
public class SavingAccount extends Account {

    protected double OVERDRAFT_LIMIT = 0;

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "Balance=" + balance +
                '}';
    }
}