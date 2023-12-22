	import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Map <Integer,Integer> mapX = new HashMap<Integer,Integer> ();
		int x[][];
		Scanner sc = new Scanner(System.in);
			// 整数の入力
			int l,r,k;
			int n,d,index,index2,j;
			int sum,result,xd;
			double rd;;
			
			l = sc.nextInt();
			r = sc.nextInt();
			sc.close();
			//if(r>2019+l) {
				//k=(r-l)/2019;
				//l=l-2019*k;
			//}
			result=2019;

			for(index=l;index<r;index++) {
				for(index2=index+1;index2<=r;index2++) {
					k=index*index2%2019;
					//System.out.print(index+":"+index2+":"+k+":");
					//System.out.println(result);
					if(k<result) {
						result=k;
					}
				}
			}
			System.out.println(result);

			
 
			// 出力
 
	}
}