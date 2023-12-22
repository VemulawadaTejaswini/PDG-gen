import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int aa = a % 10;
		int bb = b % 10;
		int cc = c % 10;
		int dd = d % 10;
		int ee = e % 10;
		
		int min = 100;
		if(min > aa){
		    min = aa;
		}if(min > bb){
		    min = bb;
		}if(min > cc){
		    min = cc;
		}if(min > dd){
		    min = dd;
		}if(min > ee){
		    min = ee;
		}
		double aaa = (Math.round((a+5) / 10))*10;
		double bbb = (Math.round((b+5) / 10))*10;
		double ccc = (Math.round((c+5) / 10))*10;
		double ddd = (Math.round((d+5) / 10))*10;
		double eee = (Math.round((e+5) / 10))*10;
		
		double zzz = aaa + bbb + ccc + ddd + eee + min -10;
      	int ans = (int)zzz;
		System.out.println(ans);
	}
}
