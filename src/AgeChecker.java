import javax.swing.JOptionPane;

public class AgeChecker {

	public static void main(String[] args) {
		// Ask user for input
		String firstName = JOptionPane.showInputDialog(null, "What is your first name?");
		String lastName = JOptionPane.showInputDialog(null, "What is your last name?");
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "What year were you born?"));
		
		// calling method to verify legal age
		boolean oldEnough = verifyLegalAge(yearOfBirth);
		
		// calling the method to put names together
		String fullName = concatenateNames(firstName, lastName);
		
		// loop to determine if user can proceed
		if(oldEnough == true) {
			JOptionPane.showMessageDialog(null,  fullName + ", you may proceed with your shopping");
		} else {
			JOptionPane.showMessageDialog(null,  fullName + ", you're not old enough, try disney.com instead!");
		}
	}
	
	// method to determine age of user
	public static boolean verifyLegalAge(int yob) {
		boolean legalAgeStatus = (2013 - yob) >= 19;
		return legalAgeStatus;
	}
	
	// method to put first name and last name data fields together
	public static String concatenateNames(String fn, String ln) {
		String fullName = fn + " " + ln;
		return fullName;
	}
}
