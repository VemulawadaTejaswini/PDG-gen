import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
//map.containsKey(A)

//Map<String, Integer> map = new HashMap<String, Integer>(n);
/*for ( キーのデータ型 key : マップの名前.keySet() ) {
	データのデータ型 data = マップの名前.get( key );
	
	// keyやdataを使った処理;
}*/
//int i = Integer.parseInt(s);

//ArrayList<String> cc = new ArrayList<>(n);
//Collections.sort(list);
//Array.sort(list);
//Arrays.asList(c).contains("a")
//list.set(1,"walk");
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	public static void main(String[] args) {
		
		long v=1000000007;
		int N=sc.nextInt();
		long cc[]=new long[N];
		long ans=0;
		for(int i=0;i<N;i++) {
			cc[i]=sc.nextLong();
		}
		
		for(int a=0;a<N;a++) {
			for(int b=a;b<N;b++) {
				ans+=(cc[a]^cc[b]);
				
			}
		}
		
		
		p(ans%v);
		
	}

	
	
	
}
