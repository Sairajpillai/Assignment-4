import java.util.Scanner;

class MaxCount {
	boolean isConverted = false;

	public void maxOccurence(String str) {
		str = str.replace(" ", "");
		char[] ch = checkCaseAndConvert(str);
		int[] res = updateIndex(ch);
		int[] rescp = updateIndex(ch);

		int maxRes = maxCount(res);
		System.out.println("Max Count " + maxRes);
		if (maxRes == 1) {
			System.out.println("There are no maxoccurence of any character");
		} else {
			for (int i = 0; i < rescp.length; i++) {
				if (rescp[i] == maxRes) {
					if (isConverted) {
						char conv = (char) (i + 97);
						System.out.println("The character with max occurence is " + conv);
					} else {
						char conv = (char) (i + 65);
						System.out.println("The character with max occurence is " + conv);
					}
				}
			}
		}

	}

	char[] checkCaseAndConvert(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
				isConverted = true;
			}
		}
		return ch;
	}

	public int[] updateIndex(char[] ch) {
		int[] res = new int[26];
		for (int i = 0; i < ch.length; i++) {
			int index = ch[i] - 65;
			res[index]++;
		}
		return res;
	}

	int maxCount(int[] res) {
		int temp = 0;
		for (int i = 0; i < res.length; i++) {
			for (int j = 1; j < res.length - i; j++) {
				if (res[j - 1] > res[j]) {
					temp = res[j - 1];
					res[j - 1] = res[j];
					res[j] = temp;
				}
			}
		}

		return res[res.length - 1];
	}

}

public class MaxOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to find the max occurence");
		String str = sc.nextLine();
		MaxCount m = new MaxCount();
		m.maxOccurence(str);

	}

}
