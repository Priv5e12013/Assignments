package week3.day2;

public class AxisBank extends BankInfo {
	
	public void Deposits() {
		System.out.println("Deposit in Bank");
	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
		obj.Deposits();
	}

}
