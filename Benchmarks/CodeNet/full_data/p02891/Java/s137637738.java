import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		long count = 0;
		long check = 1;
		long lastCheck = 1;
		if(S.length() > 2) {
			for(int i = 0; i <= S.length()-2; i++) {
				if(S.substring(i, i+1).equals(S.substring(i+1, i+2))) {
					check++;
					lastCheck = check;
				}else {
					count += (check / 2) * K;
					check = 1;
				}
			}
			if( S.length() > 2 && S.substring(0, 1).equals(S.substring(S.length()-1, S.length())) && lastCheck % 2 == 0) {
				count += K -1;
			}
			if(S.length() > 2 && S.substring(S.length()-2, S.length()-1).equals(S.substring(S.length()-1, S.length()))) {
				count += lastCheck / 2;
			}
			if(S.length() == 2 && S.substring(0,1).equals(S.substring(1,2))) {
				count+= S.length() * K;
			}
		}else {
			count = K - 1;
		}
		System.out.println(count);
		sc.close();
	}

}