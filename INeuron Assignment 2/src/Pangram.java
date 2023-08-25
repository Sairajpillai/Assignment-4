import java.util.Scanner;

class PangramCheck {
	public void checkPangram(String str) {
		str = str.replace(" ", "");
		char[] ch = convertUpperCase(str);
		boolean res = updateIndex(ch);
		if (res == true) {
			System.out.println("Its is not a pangram");
		} else {
			System.out.println("It is a pangram");
		}

	}

	char[] convertUpperCase(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		return ch;
	}

	public boolean updateIndex(char[] ch) {
		boolean temp = false;
		int[] res = new int[26];
		for (int i = 0; i < ch.length; i++) {
			int index = ch[i] - 65;
			res[index]++;
		}
		for (int i = 0; i < res.length; i++) {
			if (res[i] == 0) {
				temp = true;
				break;
			}
		}
		return temp;
	}

}

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check Pangram");
		String s = sc.nextLine();
		PangramCheck p = new PangramCheck();
		p.checkPangram(s);

	}

}
