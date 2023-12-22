import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String S1 ="";
		String S2 ="";
		String ans="";
		int cnt1 = 0;
		int cnt2 = 0;
		int i1 = 0;
		int i2 = 0;
		S1=S.substring(0, 2);
		S2=S.substring(2, 4);
		i1 = Integer.parseInt(S1);
		i2 = Integer.parseInt(S2);
		for(int i=1;i<=12;i++){
			if (i1==i) {
				cnt1= cnt1+1;
			}
		}	
		for(int j=1;j<=12;j++){
			if (i2==j) {
				cnt2=cnt2+1;
			}
		}
		if (cnt1==1&&cnt2==1) {
			ans="AMBIGUOUS";
			System.out.println(ans);
		}
		if (cnt1==1&&cnt2!=1) {
			ans="MMYY";
			System.out.println(ans);
		}
		if (cnt1!=1&&cnt2==1) {
			ans="YYMM";
			System.out.println(ans);
		}
		if (cnt1!=1&&cnt2!=1) {
			ans="NA";
			System.out.println(ans);
		}
    }
}