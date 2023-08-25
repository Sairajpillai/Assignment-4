import java.util.Scanner;

class CheckUnique{
	public void/*char[]*/ removeDuplicate(String str) {
		char res[] = new char[26];
		char c[] = str.toCharArray();
		//char res[] = new char[26];
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
			
		//return res;
	}
		if (counter != 0) {
			System.out.println("String does not contains unique charcacters");
			//System.out.print(res);
		}
		else {
			System.out.println("String contains unique characters");
		}
		/*if(counter!=0) {
			return res;
		}else {
			return res;
		}*/
	
	}
	}
public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check the uniqueness");
		String str = sc.nextLine();
		CheckUnique c= new CheckUnique();
		c.removeDuplicate(str);

	}

}
