import java.util.Scanner;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
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
		
		String charCount;
		System.out.println("How many characters would you like in your password? It can range from 8 to 128 characters.");
		do {
			charCount = scan.nextLine();
			if (Integer.parseInt(charCount) < 8 || Integer.parseInt(charCount) > 128) {
				System.out.println("Character choice outside of range. Choose again.");
			}
		} while (Integer.parseInt(charCount) < 8 || Integer.parseInt(charCount) > 128);
		System.out.printf("Your password will be %s characters long", charCount).println();
		
		ArrayList<String> passArray = new ArrayList<String>();
		ArrayList<String[]> selectionArray = new ArrayList<String[]>();
		String[] lowercaseArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[] uppercaseArr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String[] numbersArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] specialArr = {"!", "@", "#", "$", "%", "&", "*"};
		
		if (lowercaseConfirm == "Yes" || lowercaseConfirm == "Y" || lowercaseConfirm == "yes") {
			selectionArray.add(lowercaseArr);
		}
		if (uppercaseConfirm == "Yes" || uppercaseConfirm == "Y" || uppercaseConfirm == "yes") {
			selectionArray.add(uppercaseArr);
		}
		if (numberConfirm == "Yes" || numberConfirm == "Y" || numberConfirm == "yes") {
			selectionArray.add(numbersArr);
		}
		if (specialConfirm == "Yes" || specialConfirm == "Y" || specialConfirm == "yes") {
			selectionArray.add(specialArr);
		}
		
		for (int i = 0; i < Integer.parseInt(charCount); i++) {
			ArrayList<String> typeSelect = new ArrayList<String>();
			double selector = Math.random();
			
	        if (selectionArray.size() == 4) {
	            if (selector < 0.25) {
	                typeSelect.add(selectionArray.get(0));
	            } else if (selector >= 0.25 && selector < 0.50) {
	                typeSelect = selectionArray[1];
	            } else if (selector >= 0.50 && selector < 0.75) {
	                typeSelect = selectionArray[2];
	            } else {
	                typeSelect = selectionArray[3];
	            }
	        } else if (selectionArray.size() == 3) {
	            if (selector < 0.33) {
	                typeSelect = selectionArray[0];
	            } else if (selector >= 0.33 && selector < 0.66) {
	                typeSelect = selectionArray[1];
	            } else {
	                typeSelect = selectionArray[2];
	            }
	        } else if (selectionArray.size() == 2) {
	            if (selector < 0.50) {
	                typeSelect = selectionArray[0];
	            } else {
	                typeSelect = selectionArray[1];
	            }
	        } else if (selectionArray.size() == 1) { 
	            if (lowercaseConfirm == "Yes" || lowercaseConfirm == "Y" || lowercaseConfirm == "yes") {
	                typeSelect.add(lowercaseArr);
	            }
	            else if (uppercaseConfirm == true) {
	                typeSelect = uppercase;
	            }
	            else if (numberConfirm == true) {
	                typeSelect = numbercase;
	            }
	            else if (specialConfirm == true) {
	                typeSelect = specialcase;
	            }
	        }
	        
//	        double innerSelector = Math.round(Math.random() * typeSelect.size());
//	        passArray.add(typeSelect[innerSelector]);
		}
		
//	    let password = passArray.join("");
//	    return password;
	}

}
