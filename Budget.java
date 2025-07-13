import java.util.Scanner;
import java.util.ArrayList;


/*
	There are at least two forms this program can take, and from here on I'll focus on the first one:
	A sequential command line program that takes in text input as per usual. It gathers the required data,
	performs calculations, and outputs desired results.
	I want to add a responsive GUI that does on-the-fly calculations that recalculate as data is changed
	or otherwise newly entered.
	Gather data; pay rate x hours worked/weekly salary, tax rate.
	Calculate

	A budget at its core is made of two categories: Income and Outgo (or perhaps more conventionally, "Expenses".)

	My first instinct is to make objects out of these two and give them states (variables) related to amounts
	made and spent, and multipliers

 */

public class Budget {
	static double hoursWorked;
	static double grossIncome;
	static double taxedIncome(double calcTaxRate, double calcIncome){
		return calcIncome-(calcTaxRate*calcIncome);
	}
	static double netIncome;
	static double tax;
	static double rent;
	static double utilities;
	static double expenses;

	//FINAL constant Amts. most likely.
	static double payRate = 13;
	static double taxRate = 0.0765;

	/*public static void getExpenses() {
		String cont = "y";
		Scanner exp = new Scanner(System.in);
		while (cont.equals("y") || cont.equals("Y")) {
			System.out.print("Enter an expense, i.e. a bill or weekly grocery trip: ");
			expenseNum.add(exp.nextDouble());
			System.out.print("Enter a name for this expense: ");
			expenseName.add(exp.nextLine());
			System.out.print("Add another expense? y/n");
			cont = exp.next();
		}
	}*/

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		do {
			//Data Collection
			//System.out.print("Enter hourly payrate: ");
			//payRate = kb.nextDouble();
			System.out.println("Enter hours worked: ");
			hoursWorked = kb.nextDouble();
			//System.out.print("Enter a rent price:");
			//rent = kb.nextDouble();
			//Calculate hours worked. If hours worked is over 40, then subtract 40 from hours worked snd multiply it by time&1/2.
			grossIncome += payRate * hoursWorked;
			if (hoursWorked > 40) {
				grossIncome = ((hoursWorked - 40) * (payRate * 1.5) + (payRate * 40));
			} else {
				grossIncome = payRate * hoursWorked;
			}
			tax = grossIncome * taxRate;

			System.out.print("Your gross weekly income is: ");
			System.out.printf("%,.2f\n", grossIncome);
			System.out.print("Yearly, this is: ");
			System.out.printf("%,.2f\n", (grossIncome * 52));
			System.out.println("Your net weekly income is: ");
			System.out.printf("%,.2f\n", (grossIncome - tax));
			System.out.print("Yearly, this is: ");
			System.out.printf("%,.2f\n", (grossIncome - tax) * 52);
			System.out.println("Enter a new income if you'd like. Otherwise, exit with \"o\".");
		} while (payRate > 0);
	}
}