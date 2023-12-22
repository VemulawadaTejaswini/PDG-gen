import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int nagasa = a.length();
		boolean result = true;
		//while(true) {
			for(int i = 0; i < nagasa; i++) {
				int count = 0;
				char ans = a.charAt(i);
				for(int j = 0; j < nagasa; j++) {
					if(ans == a.charAt(j)) {
						count += 1;
						}
					}
				if(count % 2 == 1) {
					result = false;
				}
			}
		if(result == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}