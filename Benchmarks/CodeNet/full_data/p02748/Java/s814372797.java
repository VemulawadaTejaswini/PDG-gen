import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 


public class Main {
	static int a1[]= {0,-1,0,1};
	static int b1[]= {-1,0,1,0};
	private static Scanner sc = new Scanner(System.in);
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
	//Array.sort(list);   cc.contains(tmp)
	//Arrays.asList(c).contains("a")
	//list.set(1,"walk");//1 1 2 3 5
	static int K,N;
	static int mod =1000000007;
	public static void main(String[] args) {
		int A=sc.nextInt();
		int B=sc.nextInt();
		int M=sc.nextInt();
		int a[]=new int[A];
		int b[]=new int[B];
		int minA=0,minB=0,minABC=0;
		for(int i=0;i<A;i++) {
			a[i]=sc.nextInt();
			if(i==0)minA=a[i];
			else minA=Math.min(minA, a[i]);
		}
		for(int i=0;i<B;i++) {
			b[i]=sc.nextInt();
			if(i==0)minB=b[i];
			else minB=Math.min(minB, b[i]);
		}
		int x,y,c;
		for(int i=0;i<M;i++) {
			x=sc.nextInt()-1;
			y=sc.nextInt()-1;
			c=sc.nextInt();
			if(i==0)minABC=a[x]+b[y]-c;
			else minABC=Math.min(minABC, a[x]+b[y]-c);
		}
		p(Math.min(minABC, minA+minB));
		//System.out.println(me);
		
	}

	
	//static ArrayList<Integer> cc = new ArrayList<>(10001);
	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
}
	
