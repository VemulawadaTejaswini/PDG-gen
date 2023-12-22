import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		long n=sc.nextLong();
		if(n==1) {
			System.out.println(s.substring(0, 1));
			System.exit(0);
		}
		for(int i=0;i<s.length();i++) {
			if(!s.substring(i, i+1).equals("1")) {
				System.out.println(s.subSequence(i, i+1));
				break;
			}
		}
	}
}

