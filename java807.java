package week8;
import javax.swing.JOptionPane;
public class java807 {
	public static void main(String[]args) {
		String wagaString,dependentstring;
		double waga,weeklyPay;
		int dependents;
		final double HOUSE_IN_WEEK =37.5;
		wagaString = JOptionPane.showInputDialog(null,"Enter employee's hourly waga",
				"Salary dialog 1",JOptionPane.INFORMATION_MESSAGE);
		weeklyPay=Double.parseDouble(wagaString)*HOUSE_IN_WEEK;
		dependentstring=JOptionPane.showInputDialog(null,"How many dependents?",
				"Salary dialog 2",JOptionPane.QUESTION_MESSAGE);
		dependents=Integer.parseInt(dependentstring);
		JOptionPane.showConfirmDialog(null,"weekly salary is $"+weeklyPay+
				"\nDeductions will be made for "+dependents+" dependents");
		System.out.println("weekly salary is $" + weeklyPay + 
				"\nDeduction will be made for " + dependents + " dependents");
		System.out.println("Total pay = " + weeklyPay*dependents);
	}
}
