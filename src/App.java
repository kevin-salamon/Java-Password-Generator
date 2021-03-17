
public class App {

	public static void main(String[] args) {
		
		Password generator = new Password();
		
		String password = generator.generatePassword();
		
		System.out.println("HERE IS YOUR FINISHED PASSWORD: " + password);
	}

}
