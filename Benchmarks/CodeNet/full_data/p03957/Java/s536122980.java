import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.substring(i, i+1).equals("C"))count++;
			if(s.substring(i, i+1).equals("F"))count++;
		}
		if(count>=2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}

