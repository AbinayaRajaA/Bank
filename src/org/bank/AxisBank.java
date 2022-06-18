package org.bank;

public class AxisBank extends BankInfo{
 @Override
public void deposit() {
	System.out.println("Deposit Amount----500000");
}
 @Override
	public void deposit(int a) {
		System.out.println("Deposit Amount---100000+"+a );
	}
 @Override
	public void deposit(long l) {
		System.out.println("Deposit Amount----2000000+"+l);
	}
 public static void main(String[] args) {
	AxisBank a=new AxisBank();
	a.deposit();
	a.deposit(2000000);
	a.deposit(500000000);
	a.fixed();
	a.saving();
	System.out.println("Abi");
}
}
