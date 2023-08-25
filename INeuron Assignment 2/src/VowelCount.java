import java.util.Scanner;

class Vowel {
	static int consonant = 0;
	static int vowel = 0;
	static int specialChar = 0;

	static void countTot(String ch) {

		char[] s = convertToLowerCase(ch);

		for (int i = 0; i < s.length; i++) {
			if ((s[i] >= 'a' && s[i] <= 'z')) {

				if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {

					vowel++;
				} else {
					consonant++;
				}
			} else if ((s[i] >= 33 && s[i] <= 47) || (s[i] >= 58 && s[i] <= 64) || (s[i] >= 91 && s[i] <= 96)
					|| (s[i] >= 123 && s[i] <= 126)) {
				specialChar++;
			}
		}
	}

	static char[] convertToLowerCase(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		return ch;
	}
}

public class VowelCount {

	public static void main(String[] args) {
		System.out.println("Enter the String to count the number of Consonants,Vowel and Special Characters");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Vowel.countTot(s);
		System.out.println("Total number of Vowels " + Vowel.vowel);
		System.out.println("Total number of Consonants " + Vowel.consonant);
		System.out.println("Total number of Special Characters " + Vowel.specialChar);
	}

}
