import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt(),b=sc.nextInt();
		String str =sc.next();
		int judge=0;

		for(int i=0; i<(a+b+1); i++) {
			String s=str.substring(i,i+1);
			if(i==a) {
				if(s.equals("-")) {
					judge+=1;
				}
			}else {
				if(s.matches("[0-9]")) {
					judge+=1;
				}
			}
		}
		if(judge==(a+b+1)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}