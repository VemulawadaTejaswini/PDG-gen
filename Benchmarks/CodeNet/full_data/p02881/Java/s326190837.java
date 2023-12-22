import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			long N = scan.nextLong();
		ArrayList<Long> zenyaku_a = enum_div(N);
		ArrayList<Long> zenyaku_b = enum_div2(zenyaku_a,N);
			
		long min=zenyaku_a.get(0)+zenyaku_b.get(0);
		
			for(int i = 1;i<zenyaku_a.size();i++) {
				if(min>zenyaku_a.get(i)+zenyaku_b.get(i)) {
					min = zenyaku_a.get(i)+zenyaku_b.get(i);
				}
			}
			
			
			System.out.println(min-2);
			;
			
		}
		
		
	}
	
	
	
	
	
	private static ArrayList<Long> enum_div(long n){//数字１〜ｎまでの約数を全部Allaylistに詰め込むメソッド
		ArrayList<Long> ret = new ArrayList<Long>();
		for(long i = 1;i*i<=n;i++) {
			if(n%i==0) {
				ret.add(i);
				if(i!=1&&i*i!=n){
					ret.add(n/i);
				}
			}
		}
		
		ret.add(n);
		
		//ただここまでだと格納した約数はソートされてない
		
		Collections.sort(ret);//int型、Sting型くらいの格納した奴ならコレクションクラスのソートが使える。
		//ソートしてからcollections.reverseつかえば降順にもできる
		return ret;
		
		
	}
	
	private static ArrayList<Long> enum_div2(ArrayList<Long> a,long n){//数字１〜ｎまでの約数を全部Allaylistに詰め込むメソッド
		ArrayList<Long> ret = new ArrayList<Long>();
		for(int i =0;i<a.size();i++) {
		ret.add(n/a.get(i));
		}
		
		return ret;
		
		
	}
	
	
	
	
	
	
	
		

	}
