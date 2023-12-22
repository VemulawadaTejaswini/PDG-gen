import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 1;
		int cnt4 = 1;
		String s[]=new String[a];

		// String→byte
		for (int i = 0; i < a; i++) {
			String str = sc.next();
			byte[] sbyte = str.getBytes();
			Arrays.sort(sbyte);
			String str2 = new String(sbyte);
			s[i]=str2;
		}
		Arrays.sort(s);
		for(int i = 0;i<a-1;i++){
			if(s[i].equals(s[i+1])){
				cnt1+=1;
			}else{
				cnt2 += cnt1;
				if(cnt1>=2){
					for(int j = cnt1;j>0;j--){
						cnt3 = cnt3 * j;
					}
					for(int j = cnt1-2;j>0;j--){
						cnt4 = cnt4 * j;
					}
					cnt2 += cnt3/cnt4;
				}
				cnt1=0;
			}
		}
		if(cnt2==0){
			cnt2 = cnt1;
		}
		System.out.println(cnt2);
	}
}
