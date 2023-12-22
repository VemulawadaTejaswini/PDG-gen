import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String Sa = scanner.next();
		String Sb = scanner.next();
		String Sc = scanner.next();

		char[][] C = new char[3][100];
		C[0] = Sa.toCharArray();
		C[1] = Sb.toCharArray();
		C[2] = Sc.toCharArray();

		int[] t = new int[3];
		int now = 0;
		String ans = "";
		while(true) {
			switch(C[now][t[now]]) {
			case 'a':
				t[now]++;
				now = 0;
				break;
			case 'b':
				t[now]++;
				now = 1;
				break;
			case 'c':
				t[now]++;
				now = 2;
				break;
			}

			if(t[0]==Sa.length()&&now==0) {
				ans = "A";
				break;
			}
			if(t[1]==Sb.length()&&now==1) {
				ans = "B";
				break;
			}
			if(t[2]==Sc.length()&&now==2) {
				ans = "C";
				break;
			}
		}
		System.out.println(ans);
		scanner.close();
	}

}
