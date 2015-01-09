import java.util.Scanner;


public class TestDrive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Submit a parameter...");
		String userInput = scanner.nextLine();
		IsRound.isRound(userInput);
		scanner.close();
	}
}
