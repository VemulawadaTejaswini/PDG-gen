import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		long count = 0;
		long check = 1;
		int l = S.length();
		int first = 1;
		int last = 1;
		int oddCheck = 1;
		if(l > 2 && S.substring(0,1).equals(S.substring(l-1,l))) {
			for(int i = 0; i < l-1; i++) {
				if(S.substring(i,i+1).equals(S.substring(i+1,i+2))) {
					first++;
				}else {
					break;
				}
			}
			for(int i = l; i >= 2; i--) {
				if(S.substring(i-1,i).equals(S.substring(i-2,i-1))) {
					last++;
				}else {
					break;
				}
			}
			for(int i = first; i <= l-last-1; i++) {
				if(S.substring(i, i+1).equals(S.substring(i+1, i+2))) {
					check++;
				}else {
					count += (check / 2) * K;
					check = 1;
				}
			}
			count += first/2 + (first+last)/2 * (K-1) + last/2;
			for(int i = 0; i < l-1; i++) {
				if(S.substring(i,i+1).equals(S.substring(i+1,i+2))) {
					oddCheck++;
				}else
				break;
			}
			if(oddCheck == l) {
				count = l*K / 2;
			}
		}else if(l > 2 && !(S.substring(0,1).equals(S.substring(l-1,l)))) {
			for(int i = 0; i < l-1; i++) {
				if(S.substring(i,i+1).equals(S.substring(i+1,i+2))) {
					first++;
				}else {
					break;
				}
			}
			for(int i = l; i > 1; i--) {
				if(S.substring(i-1,i).equals(S.substring(i-2,i-1))) {
					last++;
				}else {
					break;
				}
			}
			for(int i = first; i <= l-last-1; i++) {
				if(S.substring(i, i+1).equals(S.substring(i+1, i+2))) {
					check++;
				}else {
					count += (check / 2) * K;
					check = 1;
				}
			}
			count += first/2 * K + last/2 * K;
		}else if(l == 2 && S.substring(0,1).equals(S.substring(1,2))) {
			count += K;
		}else if(l == 2 && !(S.substring(0,1).equals(S.substring(1,2)))) {
			count = 0;
		}else{	//|S|=1
			count += K /2 ;
		}
		System.out.println(count);
		sc.close();
	}

}