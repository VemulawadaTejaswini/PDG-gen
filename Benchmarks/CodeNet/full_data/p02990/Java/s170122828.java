	import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Map <Integer,Integer> mapD = new TreeMap<Integer,Integer> ();
 
		Scanner sc = new Scanner(System.in);
			// 整数の入力
			long n,k,result,d,dnum,sum,f,f1,f2;
			long index,index2,flag,key0,sum1,sum2,sum3;
			
			n = sc.nextLong();
			k = sc.nextLong();
			sc.close();
			sum1=1;
			sum2=1;
			for(index=1;index<=k;index++) {
				sum1=1;
				for(index2=n-k+index;index2>index;index2--) {
					sum1=sum1*index2;
					if(index2-n+k>0)
						sum2=sum2*(index2-n+k);
				}
				f1=sum1/sum2;
				sum1=1;
				sum2=1;
				if(k-index>0 && index-1>1) {
					sum2=1;
					for(index2=k-index+1;index2>index-1;index2--) {
						sum1=sum1*index2;
						if(k-index2>0)
						sum2=sum2*(k-index2);
					}
				}
				else {
					sum1=1;
					sum2=1;
				}
				f2=sum1/sum2;
				f=(long)(Math.pow(10,9)+1);
				result=(f1*f2)%f;
				// System.out.println("f1="+f1);
				// System.out.println("f2="+f2);
				System.out.println(result);
			}

			
 
			// 出力
 
	}
}