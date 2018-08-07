/**********************************************

Workshop # 1

Course:<JAC444> - Semester Summer

Last Name:<Zleik>

First Name:<Raeda>

ID:<113091151>

Section:<SCD>

This assignment represents my own work in accordance with Seneca Academic Policy.

Signature R.Z

Date:<07-06-2018>

**********************************************/
public class CheckingAccount extends Account {

    protected double OVERDRAFT_LIMIT = -10;

    public CheckingAccount(int id, double balance) {
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
        return "CheckingAccount{"+
                "Account ID: " + id + "\n" +
                "Balance=" + balance +
                '}';
    }
}