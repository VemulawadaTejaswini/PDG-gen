import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		for(int i = 0;i<Math.pow(2, 3);i++) {
			StringBuilder sb = new StringBuilder(S);
			boolean plus = true;
			int judge = 0;


			for(int j = 2;j>=0;j--) {
				if((1&i>>j)==1) {
					sb.insert(j+1, "+");
				}else {
					sb.insert(j+1, "-");
				}
			}

			String str = sb.toString();

			for(int n = 0;n<7;n++) {

				char st =str.charAt(n);

				if(n==0) {
					judge+= Character.getNumericValue(st);
					continue;
				}else if(n%2==0) {
					if(plus==true) {
					judge+= Character.getNumericValue(st);
					}else {
					judge-= Character.getNumericValue(st);
					}
				}else if(n%2==1) {
					if(st=='+') {
						plus=true;
					}else {
						plus =  false;
					}
				}


			}
			if(judge==7) {
				System.out.println(str+"=7");
				break;

			}
			
		}
	}
}