import java.util.Date;

public class AccountTest {

	public static void main(String[] args) {


			Account account1 = new Account(1122, 20000);
            account1.setAnnualInterestRate(0.045);
			account1.withdraw(2500);
			account1.deposit(3000);

		//	account1.setDateCreated(new java.util.Date());
		//	account1.dateCreated = new java.util.Date();
		//	account1.setDateCreated(dateCreated);
			System.out.println("Date Created:" + account1.dateCreated);
			System.out.println("Account ID:" + account1.getId());
			System.out.println("Balance:" + account1.getBalance());
			System.out.println("Monthly Interest:" + account1.getMonthlyInterest());
			System.out.println("Process completed.");

	}

}
