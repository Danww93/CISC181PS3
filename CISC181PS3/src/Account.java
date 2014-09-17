import java.util.Date; 


public class Account 
{
private int id;
private double balance;
private double InterestRate;
private Date dateCreated = new Date(); 
	
	
	public Account()
	{
		id = 0;
		balance = 0;
		InterestRate = 0;
	}
	
//------------------------------------------------------
	
	Account(int id, double balance, double InterestRate)
	{
		this.id = id;
        this.balance = balance;
        this.InterestRate = InterestRate;
	}
	
//------------------------------------------------------	
	
	public int getId() 
	{
        return id;
    }
    
//------------------------------------------------------
	
	public double getBalance() 
    {
        return balance;
    }
    
//------------------------------------------------------
	
	public double getInterestRate() 
    {
        return InterestRate;
    }
    
//------------------------------------------------------
	
	public Date getDateCreated() 
    {
        return dateCreated;
    }
	
//------------------------------------------------------
	
	public void setId(int id) 
    {
        this.id = id;
    }
    
//------------------------------------------------------
	
	public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    
//------------------------------------------------------
	
	public void setbalance(double InterestRate) 
    {
        this.InterestRate = InterestRate;
    }

//------------------------------------------------------
	
	public void setDateCreated(Date dateCreated) 
    {
        this.dateCreated = dateCreated;
    }

//------------------------------------------------------
	
	double getMonthlyInterestRate() 
    {
        return InterestRate / 12;
    }

//------------------------------------------------------
	
	public void withdraw(double amount) throws
    InsufficientFundsException
	{
		if(amount <= balance)
		{
			balance -= amount;
		}
		else
		{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}   

//------------------------------------------------------
	
	double deposit(double amount) 
    {
        return balance += amount;
    }
}
