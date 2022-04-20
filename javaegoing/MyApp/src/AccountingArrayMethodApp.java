import java.util.Scanner;

public class AccountingArrayMethodApp {

	public static void main(String[] args) {

		System.out.println("In order to find out Accounting status, please input the \"value of supply\"");
		Scanner sc = new Scanner(System.in);
		
		double valueOfSupply= sc.nextDouble();
		double vatRate =0.1;
		double expenseRate =0.3;
		
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
				
	
		double [] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
//		int i =0;
//		while (i < dividendRates.length) {
//			System.out.println("Dividend 1 : " + dividend1);
//			i = i+1;
//		}
		
		int i = 0;
		while (i < dividendRates.length) {
			System.out.println("Dividend : "+ (income*dividendRates[i]) );
			i=i+1;
		}
		
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

}
