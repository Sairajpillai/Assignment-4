import java.util.Scanner;

class CheckUnique {
	public void removeDuplicate(String str) {
		char res[] = new char[26];
		char c[] = str.toCharArray();

		int counter = 0;
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (c[i] == c[j]) {
					counter++;
					break;
				}
			}
			if (i == j) {
				res[index++] = c[i];
			}

		}
		if (counter != 0) {
			System.out.println("String does not contains unique charcacters");

		} else {
			System.out.println("String contains unique characters");
		}

	}
}

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check the uniqueness");
		String str = sc.nextLine();
		CheckUnique c = new CheckUnique();
		c.removeDuplicate(str);

	}

}
