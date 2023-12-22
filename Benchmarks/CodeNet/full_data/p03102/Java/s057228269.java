import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
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
//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek
//Deque<String> qq=new ArrayDeque<>();//push,pop,peek
//ArrayList<String> cc = new ArrayList<>(n);
//Collections.sort(list);
//Array.sort(list);
//Arrays.asList(c).contains("a")
//list.set(1,"walk");
public class Main {
	static int a1[]= {0,-1,0,1};
	static int b1[]= {-1,0,1,0};
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	static int K;
	public static void main(String[] args) {
		int N=sc.nextInt();
		int M=sc.nextInt();
		int C=sc.nextInt();
		int B[]=new int[M];
		int ctn=0;
		for(int i=0;i<M;i++) {
			B[i]=sc.nextInt();
		}
		int Ai[][]=new int[N][M];
		for(int a=0;a<N;a++) {
			int ans=0;
			for(int b=0;b<M;b++) {
				Ai[a][b]=sc.nextInt();
				ans+=Ai[a][b]*B[b];
			}
			if(ans+C>0) {
				ctn++;
			}
		}
		p(ctn);
	}
}
