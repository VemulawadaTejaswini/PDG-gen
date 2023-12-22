import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();

		int Onecnt = 0;
		int Slen = S.length();
		for(int i = 0; i < Slen; i++) {
		String Onehantei = S.substring(i, i+1);
		if(Onehantei.equals("1")) {
			Onecnt ++;
		}else {
			break;
		}
		}
		String ans = "1";
		if(Onecnt < K) {
			ans = S.substring(Onecnt,Onecnt+1);
		}

		System.out.println(ans);
		sc.close();

	}

}
