import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		long count = 0;
		long check = 1;
		int l = S.length();
		if(l > 2 && S.substring(0,1).equals(S.substring(l-1,l))) {
			for(int i = 0; i < l-1; i++) {
				if(S.substring(i, i+1).equals(S.substring(i+1, i+2))) {
					check++;
				}else {
					count += (check / 2) * K;
					check = 1;
				}
			}
			check = 1;
			for(int i = l; i > 1; i--) {
				if(S.substring(i-1,i).equals(S.substring(i-2,i-1))) {
					check++;
				}else {
					break;
				}
				count += K-1;
			}
			if(check != 1) {
				count += (check/2) * K;
			}
		}else if(l > 2 && !(S.substring(0,1).equals(S.substring(l-1,l)))) {
			for(int i = 0; i < l-1; i++) {
				if(S.substring(i, i+1).equals(S.substring(i+1, i+2))) {
					check++;
				}else {
					count += (check / 2) * K;
					check = 1;
				}
			}
			check = 1;
			for(int i = l-1; i > 1; i--) {
				if(S.substring(i-1,i).equals(S.substring(i-2,i-1))) {
					check++;
				}else {
					break;
				}
			}
			if(check != 1) {
				count += (check/2) * K;
			}
		}else if(l == 2 && S.substring(0,1).equals(S.substring(1,2))) {
			count += K;
		}else if(l == 2 && !(S.substring(0,1).equals(S.substring(1,2)))) {
			count = 0;
		}else{	//|S|=1
			count += K -1;
		}
		System.out.println(count);
		sc.close();
	}

}