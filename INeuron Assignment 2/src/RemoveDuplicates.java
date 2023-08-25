import java.util.Scanner;

class CheckDuplicate {
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
			System.out.println("After Removing Duplicates");
			System.out.print(res);
		} else {
			System.out.println("No Duplicates are Present");
		}

	}
}

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to remove the duplicates");
		String str = sc.nextLine();
		CheckDuplicate c = new CheckDuplicate();
		c.removeDuplicate(str);

	}

}
