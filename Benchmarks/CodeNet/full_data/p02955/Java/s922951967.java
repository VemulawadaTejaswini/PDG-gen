import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 


public class Main {
	static int a1[]= {0,-1,0,1};
	static int b1[]= {-1,0,1,0};
	private static         Scanner sc = new Scanner(System.in);
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
	static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
//R 82 L 76
	static int v[]=new int[501];
	static long D=0;
	public static void main(String[] args) {
			N=sc.nextInt();
			K=sc.nextInt();
			
			long sum=0;
			for(int i=0;i<N;i++) {
				v[i]=sc.nextInt();
				sum+=v[i];
			}
			ArrayList<Long> cc = new ArrayList<>(100);
			
			for(long i=1;i*i<=sum;i++) {
				
				if(sum%i==0) {
					
					cc.add(i);
					cc.add(sum/i);
				}
			}
			Collections.sort(cc);
			
			Collections.reverse(cc);
			
			
			//System.out.println(cc);
			
			for(long a:cc) {
				D=a;
				if(v(0,0,0)) {
					p(a);
					break;
				}
			}
	}
	static boolean v(int i,long b,long sum) {
		if(i==N) {
			if(b==0||b%D==0) {
				if(sum/2<=K) {
					return true;
				}else return false;
			}else return false;
		}
		
		if(v(i+1,b+v[i]%D,sum+v[i]%D))return true;
		
		if(v(i+1,b-(D-v[i]%D),sum+v[i]%D))return true;
		return false;
		
	}
	
	
	
	//static int memo[][]=new int[501][1000];
	

	
	//N==S
	//E==W
//83 S 
	//69E
	//78N
	//87W
	
	//static ArrayList<Integer> cc = new ArrayList<>(10001);
	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	public static int gcd(int a, int b) {
        return b == 0 ? a: gcd(b, a % b);
	}
	static String nextPermutation(String s) {
		ArrayList<Character> list=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			list.add(s.charAt(i));
		}
		int pivotPos=-1;
		char pivot=0;
		for(int i=list.size()-2;i>=0;i--) {
			if(list.get(i)<list.get(i+1)) {
				pivotPos=i;
				pivot=list.get(i);
				break;
			}
		}
		if(pivotPos==-1&&pivot==0) {
			return "Final";
		}
		int L=pivotPos+1,R=list.size()-1;
		
		
		
		int minPos=-1;
		char min =Character.MAX_VALUE;
		
		for(int i=R;i>=L;i--) {
			if(pivot<list.get(i)) {
				if(list.get(i)<min) {
					min=list.get(i);
					minPos=i;
				}
			}
		}
		
		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R+1));
		
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}
}
	
