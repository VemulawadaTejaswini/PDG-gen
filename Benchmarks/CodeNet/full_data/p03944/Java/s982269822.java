import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 


public class Main {
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
	//static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	
	
	
	public static void main(String[] args) {
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		//M 77 || //A 65 || //R 82 || //C 67 || //H 72 || 
		int W=sc.nextInt();
		int H=sc.nextInt();
		int N=sc.nextInt();
		
		int x[]=new int[N];
		int y[]=new int[N];
		int a[]=new int[N];
		
		int x1=0;//saidai
		int x2=100000009;//saisyou
		int y1=0;//saidai
		int y2=100000009;//saisyou
		for(int i=0;i<N;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			a[i]=sc.nextInt();
			
			if(a[i]==1) {
				x1=Math.max(x1, x[i]);
			}else if(a[i]==2) {
		
				x2=Math.min(x2, x[i]);
				
			}else if(a[i]==3) {
				y1=Math.max(y1, y[i]);
			}else if(a[i]==4) {
				
				y2=Math.min(y2, y[i]);
			}
		}
		
		x2=Math.min(x2,W);
		y2=Math.min(y2,H);
		
		if(y1>y2||x1>x2)p(0);
		else p((y2-y1)*(x2-x1));
		
		
		
		
		
	}

	

	public static long gcd(long a, long b) {
        return b == 0 ? a: gcd(b, a % b);
	}
	
	
	

	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
