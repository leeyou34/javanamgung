import java.util.Scanner;

class Accounting {
	
	// field �κ�
	public static double vatRate;
	public static double valueOfSupply;
	public static double expenseRate;
	
	// method �κ�
	public static void print() { // print method �ȿ� � ���۵��� �� ������ ���� �Ǿ��ִ�.
		
		double vat = getVAT();
		double total = getTotal();
		double expense = getExpense();
		double income = getIncome();
		double dividend1 = getDividend1();
		double dividend2 = getDividend2();
		double dividend3 = getDividend3();
		
		System.out.println("=====================================");
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend1 : "+ dividend1);
		System.out.println("Dividend1 : "+ dividend2);
		System.out.println("Dividend1 : "+ dividend3);
		System.out.println("=====================================");
		
	}

	public static double getDividend3() { // ����Ʈ �޼ҵ� ���� �ִ� �޼ҵ���� �����ߴ�.
		return getIncome() * 0.2;
	}

	public static double getDividend2() {
		return getIncome() * 0.3;
	}

	public static double getDividend1() {
		return getIncome() * 5;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	// this part is method.
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
}

//class Accounting1 {
//	
//	// field �κ�
//	public static double vatRate;
//	public static double valueOfSupply;
//	public static double expenseRate;
//	
//	// method �κ�
//	public static void print() { // print method �ȿ� � ���۵��� �� ������ ���� �Ǿ��ִ�.
//		
//		double vat = getVAT();
//		double total = getTotal();
//		double expense = getExpense();
//		double income = getIncome();
//		double dividend1 = getDividend1();
//		double dividend2 = getDividend2();
//		double dividend3 = getDividend3();
//		
//		System.out.println("=====================================");
//		System.out.println("Value of supply : " + valueOfSupply);
//		System.out.println("VAT : " + vat);
//		System.out.println("Total : " + total);
//		System.out.println("Expense : " + expense);
//		System.out.println("Income : " + income);
//		System.out.println("Dividend1 : "+ dividend1);
//		System.out.println("Dividend1 : "+ dividend2);
//		System.out.println("Dividend1 : "+ dividend3);
//		System.out.println("=====================================");
//		
//	}
//
//	public static double getDividend3() { // ����Ʈ �޼ҵ� ���� �ִ� �޼ҵ���� �����ߴ�.
//		return getIncome() * 0.2;
//	}
//
//	public static double getDividend2() {
//		return getIncome() * 0.3;
//	}
//
//	public static double getDividend1() {
//		return getIncome() * 5;
//	}
//
//	public static double getIncome() {
//		return valueOfSupply - getExpense();
//	}
//
//	public static double getExpense() {
//		return valueOfSupply * expenseRate;
//	}
//
//	public static double getTotal() {
//		return valueOfSupply + getVAT();
//	}
//	
//	// this part is method.
//	public static double getVAT() {
//		return valueOfSupply * vatRate;
//	}
//}
//
//class Accounting2 {
//	
//	// field �κ�
//	public static double vatRate;
//	public static double valueOfSupply;
//	public static double expenseRate;
//	
//	// method �κ�
//	public static void print() { // print method �ȿ� � ���۵��� �� ������ ���� �Ǿ��ִ�.
//		
//		double vat = getVAT();
//		double total = getTotal();
//		double expense = getExpense();
//		double income = getIncome();
//		double dividend1 = getDividend1();
//		double dividend2 = getDividend2();
//		double dividend3 = getDividend3();
//		
//		System.out.println("=====================================");
//		System.out.println("Value of supply : " + valueOfSupply);
//		System.out.println("VAT : " + vat);
//		System.out.println("Total : " + total);
//		System.out.println("Expense : " + expense);
//		System.out.println("Income : " + income);
//		System.out.println("Dividend1 : "+ dividend1);
//		System.out.println("Dividend1 : "+ dividend2);
//		System.out.println("Dividend1 : "+ dividend3);
//		System.out.println("=====================================");
//		
//	}
//
//	public static double getDividend3() { // ����Ʈ �޼ҵ� ���� �ִ� �޼ҵ���� �����ߴ�.
//		return getIncome() * 0.2;
//	}
//
//	public static double getDividend2() {
//		return getIncome() * 0.3;
//	}
//
//	public static double getDividend1() {
//		return getIncome() * 5;
//	}
//
//	public static double getIncome() {
//		return valueOfSupply - getExpense();
//	}
//
//	public static double getExpense() {
//		return valueOfSupply * expenseRate;
//	}
//
//	public static double getTotal() {
//		return valueOfSupply + getVAT();
//	}
//	
//	// this part is method.
//	public static double getVAT() {
//		return valueOfSupply * vatRate;
//	}
//}
//
//class Accounting3 {
//	
//	// field �κ�
//	public static double vatRate;
//	public static double valueOfSupply;
//	public static double expenseRate;
//	
//	// method �κ�
//	public static void print() { // print method �ȿ� � ���۵��� �� ������ ���� �Ǿ��ִ�.
//		
//		double vat = getVAT();
//		double total = getTotal();
//		double expense = getExpense();
//		double income = getIncome();
//		double dividend1 = getDividend1();
//		double dividend2 = getDividend2();
//		double dividend3 = getDividend3();
//		
//		System.out.println("=====================================");
//		System.out.println("Value of supply : " + valueOfSupply);
//		System.out.println("VAT : " + vat);
//		System.out.println("Total : " + total);
//		System.out.println("Expense : " + expense);
//		System.out.println("Income : " + income);
//		System.out.println("Dividend1 : "+ dividend1);
//		System.out.println("Dividend1 : "+ dividend2);
//		System.out.println("Dividend1 : "+ dividend3);
//		System.out.println("=====================================");
//		
//	}
//
//	public static double getDividend3() { // ����Ʈ �޼ҵ� ���� �ִ� �޼ҵ���� �����ߴ�.
//		return getIncome() * 0.2;
//	}
//
//	public static double getDividend2() {
//		return getIncome() * 0.3;
//	}
//
//	public static double getDividend1() {
//		return getIncome() * 5;
//	}
//
//	public static double getIncome() {
//		return valueOfSupply - getExpense();
//	}
//
//	public static double getExpense() {
//		return valueOfSupply * expenseRate;
//	}
//
//	public static double getTotal() {
//		return valueOfSupply + getVAT();
//	}
//	
//	// this part is method.
//	public static double getVAT() {
//		return valueOfSupply * vatRate;
//	}
//}
//
//class Accounting4 {
//	
//	// field �κ�
//	public static double vatRate;
//	public static double valueOfSupply;
//	public static double expenseRate;
//	
//	// method �κ�
//	public static void print() { // print method �ȿ� � ���۵��� �� ������ ���� �Ǿ��ִ�.
//		
//		double vat = getVAT();
//		double total = getTotal();
//		double expense = getExpense();
//		double income = getIncome();
//		double dividend1 = getDividend1();
//		double dividend2 = getDividend2();
//		double dividend3 = getDividend3();
//		
//		System.out.println("=====================================");
//		System.out.println("Value of supply : " + valueOfSupply);
//		System.out.println("VAT : " + vat);
//		System.out.println("Total : " + total);
//		System.out.println("Expense : " + expense);
//		System.out.println("Income : " + income);
//		System.out.println("Dividend1 : "+ dividend1);
//		System.out.println("Dividend1 : "+ dividend2);
//		System.out.println("Dividend1 : "+ dividend3);
//		System.out.println("=====================================");
//		
//	}
//
//	public static double getDividend3() { // ����Ʈ �޼ҵ� ���� �ִ� �޼ҵ���� �����ߴ�.
//		return getIncome() * 0.2;
//	}
//
//	public static double getDividend2() {
//		return getIncome() * 0.3;
//	}
//
//	public static double getDividend1() {
//		return getIncome() * 5;
//	}
//
//	public static double getIncome() {
//		return valueOfSupply - getExpense();
//	}
//
//	public static double getExpense() {
//		return valueOfSupply * expenseRate;
//	}
//
//	public static double getTotal() {
//		return valueOfSupply + getVAT();
//	}
//	
//	// this part is method.
//	public static double getVAT() {
//		return valueOfSupply * vatRate;
//	}
//}
//
//class Accounting5 {
//	
//	// field �κ�
//	public static double vatRate;
//	public static double valueOfSupply;
//	public static double expenseRate;
//	
//	// method �κ�
//	public static void print() { // print method �ȿ� � ���۵��� �� ������ ���� �Ǿ��ִ�.
//		
//		double vat = getVAT();
//		double total = getTotal();
//		double expense = getExpense();
//		double income = getIncome();
//		double dividend1 = getDividend1();
//		double dividend2 = getDividend2();
//		double dividend3 = getDividend3();
//		
//		System.out.println("=====================================");
//		System.out.println("Value of supply : " + valueOfSupply);
//		System.out.println("VAT : " + vat);
//		System.out.println("Total : " + total);
//		System.out.println("Expense : " + expense);
//		System.out.println("Income : " + income);
//		System.out.println("Dividend1 : "+ dividend1);
//		System.out.println("Dividend1 : "+ dividend2);
//		System.out.println("Dividend1 : "+ dividend3);
//		System.out.println("=====================================");
//		
//	}
//
//	public static double getDividend3() { // ����Ʈ �޼ҵ� ���� �ִ� �޼ҵ���� �����ߴ�.
//		return getIncome() * 0.2;
//	}
//
//	public static double getDividend2() {
//		return getIncome() * 0.3;
//	}
//
//	public static double getDividend1() {
//		return getIncome() * 5;
//	}
//
//	public static double getIncome() {
//		return valueOfSupply - getExpense();
//	}
//
//	public static double getExpense() {
//		return valueOfSupply * expenseRate;
//	}
//
//	public static double getTotal() {
//		return valueOfSupply + getVAT();
//	}
//	
//	// this part is method.
//	public static double getVAT() {
//		return valueOfSupply * vatRate;
//	}
//}


public class AccountingClassApp {

	
	public static void main(String [] args) { // ���� �޼ҵ忡�� ���۸� �� �� �ִ� �͵��� �����ϰ� ���� �ߴ�.
		//...
		System.out.println("In order to find out Accounting status, please input the \"value of supply\"");
		Scanner sc = new Scanner(System.in);
//		//...
//		Accounting1.valueOfSupply = sc.nextDouble();
//		Accounting1.vatRate = 0.1;
//		Accounting1.expenseRate = 0.3;
//		Accounting1.print();
//		//...
//		Accounting2.valueOfSupply = sc.nextDouble();
//		Accounting2.vatRate = 0.05;
//		Accounting2.expenseRate = 0.2;
//		Accounting2.print();
//		//...
//		Accounting3.valueOfSupply = sc.nextDouble();
//		Accounting3.vatRate = 0.01;
//		Accounting3.expenseRate = 0.1;
//		Accounting3.print();
//		//...
//		Accounting4.valueOfSupply = sc.nextDouble();
//		Accounting4.vatRate = 0.2;
//		Accounting4.expenseRate = 0.6;
//		Accounting4.print();
//		//...
//		Accounting5.valueOfSupply = sc.nextDouble();
//		Accounting5.vatRate = 0.15;
//		Accounting5.expenseRate = 0.25;
//		Accounting5.print();
		
		//below is called instance.
		
		Accounting a1 = new Accounting();
		a1.valueOfSupply = sc.nextDouble();
		a1.vatRate = 0.1;
		a1.expenseRate =0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = sc.nextDouble();
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		
	}
}

