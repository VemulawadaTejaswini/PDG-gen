import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long N = scan.nextLong();
			int min = Integer.MAX_VALUE;
			for(Long key:enum_div(N)) {
				String A = String.valueOf(key);
				String B= String.valueOf(N/key);
				if(min>Math.max(A.length(), B.length()))
					min=Math.max(A.length(), B.length());
				
				
			}
			
			System.out.println(min);
			
			
			
			
		}
		
		
	}
	
	
	private static ArrayList<Long> enum_div(long n){//数字１〜ｎまでの約数を全部Allaylistに詰め込むメソッド
		ArrayList<Long> ret = new ArrayList<Long>();
		for(long i = 1;i*i<=n;i++) {
			if(n%i==0) {
				ret.add(i);
				if(i*i!=n){
					ret.add(n/i);
				}
			}
		}
		
		//ただここまでだと格納した約数はソートされてない
		
		Collections.sort(ret);//int型、Sting型くらいの格納した奴ならコレクションクラスのソートが使える。
		//ソートしてからcollections.reverseつかえば降順にもできる
		return ret;
		
		
		
	}
		

}
