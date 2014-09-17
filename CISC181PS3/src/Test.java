


public class Test {

	public static void main(String[] args) 
	{
		Account account = new Account(1122, 200.00, 0.045);
        account.deposit(0);

        try
        {
           System.out.println("\nWithdrawing $100...");
           account.withdraw(100.00);
           System.out.println("\nWithdrawing $600...");
           account.withdraw(600.00);
        }catch(InsufficientFundsException e)
        {
           System.out.println();
           System.out.printf("Sorry, but you are short $%.2f%n", e.getAmount());
           e.printStackTrace();
           System.out.println();
        }
        
        System.out.printf("Balance: $%.2f%n", account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterestRate());
        System.out.println("Account created on: " + account.getDateCreated());

	}

}
