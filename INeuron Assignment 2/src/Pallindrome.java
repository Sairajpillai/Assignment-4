
public class Pallindrome {
	public static void main(String args[]) {

		String s = "2552";
		String res = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			res += s.charAt(i);
		}
		if (s.equals(res)) {
			System.out.println("It is a palindrome");

		} else {
			System.out.println("It is not a palindrome");
		}
	}

}
