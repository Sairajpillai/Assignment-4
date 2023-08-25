import java.util.Scanner;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String to print the duplicates");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int counter=0;
			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j]&&c[i]!=' ') {
					counter++;
					c[j]='O';
				}
			}
			if(counter>0&&c[i]!='O') {
				System.out.println(c[i]);
			}
		}
		

	}

}
