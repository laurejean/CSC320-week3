import java.util.Scanner;

public class TaxWithholding {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		//Declaration & initialization of variable
		double weeklyIncome;
		double taxRate = 0;
		
		System.out.print("Please enter your weekly income: ");
		
		weeklyIncome = scnr.nextDouble();
		
		//Tax Calculation
		if(weeklyIncome < 500) {
			taxRate = 0.10;
		}else if(weeklyIncome >= 500 && weeklyIncome < 1500) {
			taxRate = 0.15;
		}else if(weeklyIncome >= 1500 && weeklyIncome < 2500) {
			taxRate = 0.20;
		}else if(weeklyIncome >= 2500) {
			taxRate = 0.30;
		}
		
		//Print out
		System.out.println("Your tax rate is: " + taxRate);
		System.out.print("Your weekly average tax withholding is: " + weeklyIncome * taxRate);
				
			}
		}
		
		
		
	


