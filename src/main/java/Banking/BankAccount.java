package Banking;

public class BankAccount {
	private long accountNumber; 
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;
    
    private BankAccount() {
    	
    }
	//https://www.geeksforgeeks.org/static-class-in-java/

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", owner=" + owner + ", branch=" + branch + ", balance="
				+ balance + ", interestRate=" + interestRate + "]";
	}


	///creating a static nested class
	public static class BankAccountBuilder {   
		private long accountNumber; 
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;
        
        public BankAccountBuilder(long accountNumber) {
        	this.accountNumber = accountNumber;
        }
        
        public BankAccountBuilder withOwner(String owner) {    //returns Builder
        	this.owner = owner;
        	return this;
        }
        public BankAccountBuilder atBranch(String branch) {
        	this.branch = branch;
        	return this;
        }
        public BankAccountBuilder withBalance(double balance) {
        	this.balance = balance;
        	return this;
        }
        
        public BankAccount build(){
            //Here we create the actual bank account object, which is always in a fully initialised state when it's returned.
            BankAccount account = new BankAccount();  //Since the builder is in the BankAccount class, we can invoke its private constructor.
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;

            return account;
        }
	}
	
	
	
}
