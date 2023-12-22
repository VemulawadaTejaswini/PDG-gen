import java.util.HashMap;
import java.util.Map;
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
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		String S=sc.next();
		String T=sc.next();
		
		
		
		if(S.charAt(0)!=T.charAt(0))p(-1);
		else {
			boolean x=true;
			int L=lcm(N,M);
			
			
			int v[]=new int[L+1];
			
			
			for(int i=1;i<N;i++) {
				v[i*(L/N)+1]=i;
				
			}
			
			for(int i=1;i<M;i++) {
					if(v[i*(L/M)+1]!=0) {
						if(S.charAt(v[i*(L/M)+1])!=T.charAt(i)) {
							x=false;
							break;
						}
					}
				}
			if(x) p(L);
			else p(-1);
		}
		
		
	}

	

	public static int gcd(int a, int b) {
        return b == 0 ? a: gcd(b, a % b);
	}
	public static int lcm(int n, int m) {
        return n / gcd(n, m) * m;
}
	
	

	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
