import java.util.Scanner;

class CheckAnagram {
	public void anagram(String s1, String s2) {

		char[] ch1Low = checkCaseAndConvert(s1);
		char[] ch2Low = checkCaseAndConvert(s2);

		char[] sorch1 = bubbleSort(ch1Low);
		char[] sorch2 = bubbleSort(ch2Low);

		boolean flag = false;
		for (int i = 0; i < s1.length(); i++) {
			if (sorch1[i] != sorch2[i]) {
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("It is a anagram");
		} else {
			System.out.println("It is not a anagram");
		}

	}

	char[] checkCaseAndConvert(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		return ch;
	}

	char[] bubbleSort(char[] ch) {
		char temp = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 1; j < ch.length - i; j++) {
				if (ch[j - 1] > ch[j]) {
					temp = ch[j - 1];
					ch[j - 1] = ch[j];
					ch[j] = temp;
				}
			}

		}
		return ch;
	}

}

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st String");
		String s1 = sc.nextLine();
		s1 = s1.replace(" ", "");
		System.out.println("Enter the 2nd String");
		String s2 = sc.nextLine();
		s2 = s2.replace(" ", "");

		if (s1.length() == s2.length()) {
			CheckAnagram ca = new CheckAnagram();
			ca.anagram(s1, s2);

		} else {
			System.out.println("Not a Anagram");
		}

	}

}
