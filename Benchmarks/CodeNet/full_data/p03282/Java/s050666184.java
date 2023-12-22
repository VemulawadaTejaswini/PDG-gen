import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		long k=sc.nextLong();
		if(k==1) {
			System.out.println(s.substring(0, 1));
		}else {
			for(int i=0;i<s.length();i++) {
				if(i+1==k&&s.substring(i, i+1).equals("1")) {
					System.out.println(s.substring(i, i+1));
					break;
				}
				if(!s.substring(i, i+1).equals("1")) {
					System.out.println(s.substring(i, i+1));
					break;
				}
			}
		}
	}
}

