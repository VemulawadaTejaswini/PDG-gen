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
	public static void main(String[] args) {
			String S=sc.next();
			boolean x=true;
			int rr=0;
			int ll=0;
			
			int v[]=new int[S.length()];
		for(int i=0;i<S.length();i++) {
			
			int rl1=0;
			
			char a=S.charAt(i);
			while(a==82) {
				
					rr++;
					i++;
					a=S.charAt(i);
				}
			rl1=i-1;
			
			while(a==76) {
				ll++;
				i++;
				a=S.charAt(i);
				if(i+1==S.length()) {
					ll++;
					break;
				}
			}
			
			if(rr%2==0) {
				v[rl1]+=rr/2;
				v[rl1+1]+=rr/2;
			}else {
				v[rl1]+=rr/2+1;
				v[rl1+1]+=rr/2;
			}
			if(ll%2==0) {
				v[rl1]+=ll/2;
				v[rl1+1]+=ll/2;
			}else {
				v[rl1+1]+=ll/2+1;
				v[rl1]+=ll/2;
			}
			rr=1;
			ll=0;
		}
		
		for(int i=0;i<S.length();i++) {
			if(i==0) {
				System.out.print(v[i]);
				continue;
			}
			System.out.print(" "+v[i]);
		}
		
		
		
	}
	static int v(int a) {
		return a*(a-1)/2;
	}

	
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
	
