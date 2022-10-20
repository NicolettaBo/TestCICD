package Banking;

public class TestDriverForBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount.BankAccountBuilder(1234L)
	            .withOwner("Marge")
	            .atBranch("Springfield")
	            .build();
		
		System.out.print(account.toString());
		
	}

}
