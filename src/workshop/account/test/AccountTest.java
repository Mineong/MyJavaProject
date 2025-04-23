package workshop.account.test;

import javax.naming.InsufficientResourcesException;

// ctrl+shift+o
import workshop.account.entity.Account;

public class AccountTest {
	public static void main(String[] args) {
		//Account °´Ã¼
		Account account = new Account("A1100", "221-22-3477", 100000);
		System.out.println(account); // account.toString()
		System.out.println("°èÁÂ¹øÈ£: "+ account.getCustId());
		System.out.println("°í°´¹øÈ£: "+ account.getAcctId());
		System.out.println("ÀÜ¾×: "+ account.getBalance());
		
		System.out.println("10000¿ø ÀÔ±Ý");
		account.deposit(10000);
		System.out.println("ÀÜ¾×: "+ account.getBalance());
		
		System.out.println("20000¿ø Ãâ±Ý");
		try {
			account.withdraw(20000);
			System.out.println("ÀÜ¾×: "+ account.getBalance());
			
			account.withdraw(10000);
			System.out.println("ÀÜ¾×: "+ account.getBalance());
			
		} catch (InsufficientResourcesException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
