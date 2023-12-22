import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;
import java.math.*;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		// 出力
		//System.out.println("");
		//double countx=0;
		int n=sc.nextInt();
		

		
		int[] v = new int[n];
		int[] odd =new int[n/2];
		int[] even=new int[n/2];
		
		for(int i=0;i<n/2;i++){//0 origin
			even[i]=sc.nextInt();
			odd[i]=sc.nextInt();
		}
		if(n==2){
			if(even[0]==odd[0]){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
			System.exit(0);
		}
		Arrays.sort(even);
		Arrays.sort(odd);
		for(int i=0;i<n/2;i++){
			//System.out.println("eveni"+even[i]);
		}
		
		int now=even[0];
		//int numcount=1;
		int count=1;
		int maxcount=0;
		int emax=0;//一番多いやつ
		int e2nd=0;//2番目に多いやつ
		int e2count=0;
		for(int i=1;i<n/2;i++){
			if(now!=even[i]){
				if(maxcount<count){
					maxcount=count;
					emax=now;
				}else if(e2count<count){
					e2count=count;
					e2nd=now;
					
				}
				now=even[i];
				count=1;
			}else{
				count++;
			}
		}
		if(count>maxcount){
			emax=now;
			maxcount=count;
			}else if(e2count<count){
				e2count=count;
				e2nd=now;
			}
	
		
		
		
		int onow=odd[0];
		//int numcount=1;
		int ocount=1;
		int omaxcount=0;
		int omax=0;//一番多いやつ
		int o2nd=0;//2番目に多いやつ
		int o2count=0;
		for(int i=1;i<n/2;i++){
			if(onow!=odd[i]){
				if(omaxcount<ocount){
					omaxcount=ocount;
					omax=onow;
				}else if(o2count<ocount){
					o2count=ocount;
					o2nd=onow;
				}
				now=odd[i];
				ocount=1;
			}else{
				ocount++;
			}
		}
		if(ocount>omaxcount){
			omax=onow;
			omaxcount=ocount;
			}else if(o2count<ocount){
				o2count=ocount;
				o2nd=onow;
			}
	
		//System.out.print("maxcount"+maxcount);
		int sum;
		if(emax!=omax){
			sum=n-(maxcount+omaxcount);
		}else{
			sum=n-Math.max(maxcount+o2count, omaxcount+e2count);
		}
		System.out.println(sum);
	}
}