import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
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
	static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	static int INF=1000000007;
	
	public static void main(String[] args) {
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		//int a[]=new int[N];for(int i=0;i<N;i++) {}
		//Ae2+Be2=Ce2
		//StringBuffer str = new StringBuffer(hoge1);
		//for(int i=0;i<N;i++) {}
		
		
		int N=sc.nextInt();
		int u[]=new int[N-1];
		int v[]=new int[N-1];
		int w[]=new int[N-1];
		Map<Integer, Map<Integer,Integer>> map = new HashMap<Integer, Map<Integer,Integer>>(N-1);
		int t=0;
		for(int i=0;i<N-1;i++) {
			u[i]=sc.nextInt();
			v[i]=sc.nextInt();
			w[i]=sc.nextInt();
			if(w[i]%2==0&&t==0) {
				t=u[i];
			}
			if(!map.containsKey(u[i])) {
				Map<Integer, Integer> m= new HashMap<Integer,Integer>();
				map.put(u[i], m);
			}
			if(!map.containsKey(v[i])) {
				Map<Integer, Integer> m= new HashMap<Integer,Integer>();
				map.put(v[i],m);
			}
			map.get(u[i]).put(v[i], w[i]);
			map.get(v[i]).put(u[i], w[i]);
		}
			
			
		int f[]=new int[N];
		
		Queue<Integer> qq=new ArrayDeque<>(); //add,poll,peek
		
		if(t==0) {
			qq.add(u[0]);
			boolean H[]=new boolean[N];
			H[u[0]-1]=true;
			while(qq.peek()!=null) {
				int x=qq.poll();
				for(int i:map.get(x).keySet()) {
					if(H[i-1])continue;
					if(f[x-1]==0) {
						f[i-1]=1;
					}else {
						f[i-1]=0;
					}
					H[i-1]=true;
					qq.add(map.get(x).get(i));
				}
				
				
				
				
			}
			
			
			
			
			
			
			
			
		}else {
		qq.add(t);
		f[t-1]=1;
		while(qq.peek()!=null) {
			int x=qq.poll();
			for(int i:map.get(x).keySet()) {
				if(f[i-1]==0&&map.get(x).get(i)%2==0) {
						f[i-1]=1;
						qq.add(i);
				}
				if(f[i-1]==1&&map.get(x).get(i)%2==1) {
					f[i-1]=0;
			}
				
			}
		}
		}
		
		for(int i:f) {
			p(i);
		}
		
		
	}
	
		
	
	
		
	
	public static long modPow(long g,long N) {
		long T=1;
		for(int i=0;i<N;i++) {
			T*=g;
			T%=mod;
		}
		return T;
	}
	
	public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
	}
	
	public static long gcd(long a, long b) {
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
	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
