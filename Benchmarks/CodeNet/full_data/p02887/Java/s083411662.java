import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int check = 0;
		int first = 0;
		for(int j = 0; j <= N; j++) {
			for(int i = 0; i <= S.length()-2; i++) {
				if(S.substring(i, i+1).equals(S.substring(i+1,i+2))) {
					S = S.substring(0,i+1) + S.substring(i+2, S.length());
					check++;
				}else if(check == 0){
					first++;
				}
			}
			if(check == 0) {
				break;
			}
			if(first != 0) {
				S = S.substring(first, S.length());
				first = 0;
			}
			check = 0;
		}
		System.out.println(S.length());
		sc.close();
	}

}