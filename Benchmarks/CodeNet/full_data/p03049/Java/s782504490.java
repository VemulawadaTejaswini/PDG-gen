import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int acnt = 0,bcnt = 0,sum = 0;;
		for(int i = 0;i < n;i ++) {
			String s = sc.next();
			for(int k = 0;k < s.length()-1;k++) {
				if(s.charAt(k) == 'A' && s.charAt(k+1) == 'B') sum++;
			}
			if(s.charAt(0) == 'B') bcnt++;
			if(s.charAt(s.length()-1) == 'A') acnt++;
		}
		if(acnt + bcnt == n * 2) {acnt--; bcnt--;}
		if(Math.abs(acnt-bcnt) == 0) {
			sum += acnt;
		}else if(acnt < bcnt){
			sum += bcnt - Math.abs(acnt-bcnt);
		}else {
			sum += acnt - Math.abs(acnt-bcnt);
		}
		System.out.println(sum);
	}
}