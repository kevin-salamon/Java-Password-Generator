import java.util.ArrayList;
import java.util.Scanner;

public class Password {
	
	public String generatePassword() {
		System.out.println("Please confirm the types of characters to be included in the password.");
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like lowercase letters in the password?");
		String lowercaseConfirm = scan.nextLine();
		System.out.println("Would you like uppercase letters in the password?");
		String uppercaseConfirm = scan.nextLine();
		System.out.println("Would you like numbers in the password?");
		String numberConfirm = scan.nextLine();
		System.out.println("Would you like special characters in the password?");
		String specialConfirm = scan.nextLine();
		
		ArrayList<String> selectionArray = new ArrayList<String>();
		String password = "";
		String[] lowercaseArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[] uppercaseArr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String[] numbersArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] specialArr = {"!", "@", "#", "$", "%", "&", "*"};
		
		if (lowercaseConfirm.equals("Yes") || lowercaseConfirm.equals("Y") || lowercaseConfirm.equals("yes")) {
			for (int i = 0; i < lowercaseArr.length; i++) {
				selectionArray.add(lowercaseArr[i]);
			}
		}
		
		if (uppercaseConfirm.equals("Yes") || uppercaseConfirm.equals("Y") || uppercaseConfirm.equals("yes")) {
			for (int i = 0; i < uppercaseArr.length; i++) {
				selectionArray.add(uppercaseArr[i]);
			}
		}

		if (numberConfirm.equals("Yes") || numberConfirm.equals("Y") || numberConfirm.equals("yes")) {
			for (int i = 0; i < numbersArr.length; i++) {
				selectionArray.add(numbersArr[i]);
			}
		}

		if (specialConfirm.equals("Yes") || specialConfirm.equals("Y") || specialConfirm.equals("yes")) {;
			for (int i = 0; i < specialArr.length; i++) {
				selectionArray.add(specialArr[i]);
			}
		}
		
		if (selectionArray.size() == 0) {
			System.out.println("PLEASE ENSURE YOU CHOOSE AT LEAST ONE CHARACTER TYPE! Please restart the program.");
			System.exit(0);
		}
		
		String charCount;
		System.out.println("How many characters would you like in your password? It can range from 8 to 128 characters.");
		do {
			charCount = scan.nextLine();
			if (Integer.parseInt(charCount) < 8 || Integer.parseInt(charCount) > 128) {
				System.out.println("Character choice outside of range. Choose again.");
			}
		} while (Integer.parseInt(charCount) < 8 || Integer.parseInt(charCount) > 128);
		scan.close();
		System.out.printf("Your password will be %s characters long", charCount).println();
		
		for (int i = 0; i < Integer.parseInt(charCount); i++) {
		 int selector = (int)Math.floor(Math.random() * selectionArray.size());
		 password += selectionArray.get(selector);
		}
		
		return password;
	}
}
