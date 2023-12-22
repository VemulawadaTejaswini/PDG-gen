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
      if(aa == 0){
        aa += 10;
      } if(bb == 0){
        bb += 10;
      }if(cc == 0){
        cc += 10;
      } if(dd == 0){
        dd += 10;
      } if(ee == 0){
        ee += 10;
      }
		int min = 10;
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
      double aaa = 0;
      double bbb = 0;
      double ccc = 0;
      double ddd = 0;
      double eee = 0;
      
      	if(a%10 != 0){
		 aaa = (Math.round((a+5) / 10))*10;
        }else{
         aaa = a;
        }
      if(b%10 != 0){
		bbb = (Math.round((b+5) / 10))*10;
        }else{
         bbb = b;
        }
      if(c%10 != 0){
		 ccc = (Math.round((c+5) / 10))*10;
        }else{
         ccc = c;
        }
      if(d%10 != 0){
		 ddd = (Math.round((d+5) / 10))*10;
        }else{
         ddd = d;
        }
      if(e%10 != 0){
		 eee = (Math.round((e+5) / 10))*10;
        }else{
         eee = e;
        }
      
		double zzz = aaa + bbb + ccc + ddd + eee + min;
      	int ans = (int)zzz;
		System.out.println(ans);
	}
}
