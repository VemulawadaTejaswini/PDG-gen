import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n,n1;
			Map <Integer,Integer> mapA = new HashMap<Integer,Integer> ();
			Map <Integer,Integer> mapA2 = new HashMap<Integer,Integer> ();
			int a,a1,b,b1,q,r,index,index1,index2,index3;
			int result;
			n = sc.nextInt();
			for(index=0;index<n;index++) {
				a = sc.nextInt();
				mapA.put(index,a);
			}
			
			if(n==2) {
				a=mapA.get(0);
				b=mapA.get(1);
				if(a>b) result=a;
				else result=b;
				System.out.println(result);
				return;
				}
			

			Map <Integer,Integer> mapA1 = new HashMap<Integer,Integer> (mapA);
			result=0;
			for(n1=1;n1<n-1;n1++) {
				//System.out.println("n1:"+n1);
				
				for(index=0;index<n;index++) {
					a =mapA1.get(index);
					if(index+n1<n) {
						b =mapA.get(index+n1);
						}
					else {
						b =mapA.get(index+n1-n);
						}
					if(b==1) result=a;
					else if(a==1) result=b;
					else {
						rem: for(index2=0;;index2++) {
							if(a>b) {
								a1=a;
								b1=b;
								}
							else {
								a1=b;
								b1=a;
								}
							r=a1%b1;
							if(r==0) break rem;
							a=a1-b1;
							b=b1;
							}
						if(b1==1) {
							result=1;
							}
						else {
							result=b1;
							}
					}
					// System.out.println("index:"+index+",result:"+result);
					mapA1.put(index,result);
				}
				
				result=0;
				for(index=0;index<n;index++) {
					a = mapA1.get(index);
					if(a>result) result=a;
				}
			}
			// 出力
			System.out.println(result);
	}
}