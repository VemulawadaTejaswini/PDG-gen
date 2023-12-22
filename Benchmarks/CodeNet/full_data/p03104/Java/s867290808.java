import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		if(A == B) {
			System.out.println(A);
			return;
		}
		
		long cnt[][] = new long[12][2];
		for(int i = 11; i  >= 0; i--) {
			if(A % Math.pow(2, i + 1) < Math.pow(2, i + 1) / 2) {
				cnt[i][0] += Math.pow(2, i + 1) - (A % Math.pow(2, i + 1));
			} else {
				cnt[i][1] += Math.pow(2, i + 1) - (A % Math.pow(2, i + 1));
			}
			if(B % Math.pow(2, i + 1) < Math.pow(2, i + 1) / 2) {
				cnt[i][0] += B % Math.pow(2, i + 1) + 1;
			} else {
				cnt[i][1] += B % Math.pow(2, i + 1) + 1;
			}
		}
		
		if(A + 2 == B && A % 2 == 0) {
			cnt[0][1]++;
		} else if(A + 2 == B && A % 2 == 1) {
			cnt[0][0]++;
		}
		
		String str = "";
		for(int i = 11; i >= 0; i--) {
			if(cnt[i][0] % 2 == 0 && cnt[i][1] % 2== 1) {
				str += "1";
			} else if(cnt[i][0] % 2 == 0 && cnt[i][1] % 2== 0) {
				str += "0";
			} else if(cnt[i][0] % 2 == 1 && cnt[i][1] % 2== 1) {
				str += "1";
			} else {
				str += "0";
			}
			//System.out.println(i + ": 0 :" + cnt[i][0]);
			//System.out.println(i + ": 1 :" + cnt[i][1]);
		}
		//System.out.println(str);
		System.out.println(Long.parseLong(str, 2));
	}
}
