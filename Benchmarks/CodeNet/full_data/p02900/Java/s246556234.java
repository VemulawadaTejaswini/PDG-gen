import java.util.Scanner;

public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,k,count,m,index;
		long a,b,a2,b2,common,answer,c,i,j;
		String s,t;
		
			// 整数の入力
		
		a = sc.nextLong();
		b = sc.nextLong();
		sc.close();
		count=0;
		if(a==b) {
			common=a;
		}
		else {
			if(a<b) {
				c=a;
				a=b;
				b=c;
			}
			LoopA: for(;;) {
				c=a%b;
				if(c==0) {
					common=b;
					break LoopA;
				}
				a=b;
				b=c;
			}
		}
		//System.out.print(common);
		answer=0L;
		if(common==1) answer=1L; 
		else {
			answer=1L;
			LoopC: for(i=2;i<=common;) {
				if(common%i==0) {
					answer++;
					LoopB: for(;;) {
						common=common/i;
						if(common%i>0) break LoopB;
					}
				}
				if(i*i>common) {
					answer++;
					break LoopC;
				}
				if(i==2)i=3;
				else if(i==3)i=5;
				else if(i==5)i=7;
				else if(i==7)i=11;
				else if(i==11)i=13;
				else i=i+2;
			}
		}
		System.out.print(answer);

			// 出力
 
	}
}	