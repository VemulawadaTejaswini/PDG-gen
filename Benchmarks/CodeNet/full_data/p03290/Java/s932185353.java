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

	static int D,G;
	static int p[]=new int[10];
	static int c[]=new int[10];
	public static void main(String[] args) {
		D=sc.nextInt();
		G=sc.nextInt();
		for(int i=0;i<D;i++) {
			p[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		dfs(0,0,0,0);
		Collections.sort(v2);
		p(v2.get(0));
		
	}
	static ArrayList<Integer> v2=new ArrayList<>(1000);
	static int cc=0;
	static boolean dfs(int pp,int g,int sum,int ctn) {
		//p(sum);
		if(sum>=G) {v2.add(ctn);return true;
		}
		if(pp==D)return false;
		if(p[pp]==g) {
			if(dfs(pp+1,0,sum+c[pp],ctn))return true;
			}
		if(dfs(pp,g+1,sum+(pp+1)*100,ctn+1));
		if(dfs(pp+1,0,sum,ctn));
		
		
		
		
		
		return false;
	}
	

	
	
	
}
