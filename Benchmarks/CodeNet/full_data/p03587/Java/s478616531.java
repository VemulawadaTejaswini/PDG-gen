import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.substring(i, i+1).equals("1"))count++;
		}
		System.out.println(count);
		
	}
}