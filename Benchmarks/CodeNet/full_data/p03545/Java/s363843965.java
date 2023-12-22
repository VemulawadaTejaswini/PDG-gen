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
	static String s;
	static String g;
	static int a[]=new int[4];
	public static void main(String[] args) {
		String N=sc.next();
		for(int i=0;i<4;i++) {
			a[i]=N.charAt(i)-48;
		}
		if(dfs(1,a[0],"")) {
		p(a[0]+""+g.charAt(0)+""+a[1]+""+g.charAt(1)+""+a[2]+""+g.charAt(2)+""+a[3]+"=7");
		}
	}
	static boolean dfs(int b,int sum,String v) {
		g=v;
		if(b==4)return sum==7;
		if(dfs(b+1,sum+a[b],v+"+"))return true;
		if(dfs(b+1,sum-a[b],v+"-"))return true;
		return false;
	}
	

	
	
	
}
