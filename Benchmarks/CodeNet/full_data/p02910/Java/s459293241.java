import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean flag = true;
		for(int i = 0; i < s.length(); i++) {
			if(i%2==0) {
				if(s.charAt(i) == 'L') {
					flag = false;
					break;
				}
			}else {
				if(s.charAt(i) == 'R') {
					flag = false;
					break;
				}
			}
		}
		System.out.println(flag?"Yes":"No");
		sc.close();
	}

}