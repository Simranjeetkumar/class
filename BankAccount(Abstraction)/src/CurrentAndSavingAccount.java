import java.util.Scanner;//import scanner for user input


 class Account{//parent our abstract class methods
		Scanner obj = new Scanner(System.in);
		 int your_amount = 1000;
		void deposite() {// method for enter money in account
			System.out.println("Enter your deposite amount here!");
			int d_amount = obj.nextInt();
			your_amount =your_amount+ d_amount;
			System.out.println("you deposite ammount"+" " + your_amount);
		}
		
		void withDraw() {// method for withdraw money into account
			
			System.out.println("Enter the amount for with draw!");
		int withD_amount = obj.nextInt();
		your_amount = your_amount + withD_amount;
		System.out.println("now your amount" + " " + your_amount);
		}
		
		void getBalance() {// method for showing our current balance in account
			System.out.println("your current balance is " + " " + your_amount);
		}
		
	}
class Savings extends Account{// savings class child of Account class 
	Scanner obj = new Scanner(System.in);
	 int your_amount = 1000;
	void deposite() {// method for deposite
		System.out.println("Enter your deposite amount here!");
		int d_amount = obj.nextInt();
		your_amount =your_amount+ d_amount;
		System.out.println("you deposite ammount"+" " + your_amount);
	}
	
	void withDraw() {//method for withdraw
		
		System.out.println("Enter the amount for with draw!");
	int withD_amount = obj.nextInt();
	your_amount = your_amount - withD_amount;
	System.out.println("now your amount" + " " + your_amount);
	}
	
	void getBalance() {//method for showing current balance in account
		System.out.println("your current balance is " + " " + your_amount);
	}
	
}

class CurrentAccount extends Account{//CurrentAccount class child class of Account class
	Scanner obj = new Scanner(System.in);
	 int your_amount = 1000;
	void deposite() {
		System.out.println("Enter your deposite amount here!");
		int d_amount = obj.nextInt();
		your_amount =your_amount+ d_amount;
		System.out.println("you deposite ammount"+" " + your_amount);
	}
	
	void withDraw() {
		
		System.out.println("Enter the amount for with draw!");
	int withD_amount = obj.nextInt();
	your_amount = your_amount - withD_amount;
	System.out.println("now your amount" + " " + your_amount);
	}
	
	void getBalance() {
		System.out.println("your current balance is " + " " + your_amount);
	}
	
}

public class CurrentAndSavingAccount {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choice your "// user display for choice between saving and currentacc.
				+ "Account press 1 for Saving Account "
				+ "and press 2 for Currrentaccount");
		Scanner obj = new Scanner(System.in);//
		byte a = obj.nextByte();// user decision
		if(a==1) {// user dicision if he choice 1
			Account s = new Savings();
			System.out.println("choice your work with Saving account:"// user choices for saving account.
					+ "press 1 for deposite money "
					+ "and 2 for withdraw and3 for show your existing balance in accoount");
			byte a1 = obj.nextByte();//user decision
			if(a1 == 1) {// methods call according to user choice 
				s.deposite();
			}
			else if(a1 == 2) {
				s.withDraw();
			}
			else if(a1 == 3) {
				s.getBalance();
			}
			
		}
		else if (a == 2) {//user choice for current account
			Account c = new CurrentAccount();// current account object 
			System.out.println("choice your work with current account prees 1 for deposite money "
					+ "and 2 for withdraw money and 3 for getBalance");
			byte c1 = obj.nextByte();
			if(c1 == 1) {//call methods acc. to user choice
				c.deposite();
			}
			else if(c1 ==2) {
				c.withDraw();
			}
			else if(c1 == 3) {
				c.getBalance();
			}
			
		}
		
	}

}
