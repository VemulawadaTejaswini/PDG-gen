import java.util.ArrayList;
import java.util.Collections;
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
	static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	public static void main(String[] args) {
		int H=sc.nextInt();
		int W=sc.nextInt();
		
		//. 46 || # 35
		
		String v[]=new String[H];
		
		int t=0;
		boolean x=true;
		for(int i=0;i<H;i++) {
			String S=sc.next();
			for(int a=0;a<S.length();a++) {
				if(S.charAt(a)==35) {
				v[t]=S;
				t++;
				
				break;
				}
			}
		}
		
		
		for(int i=0;t>0&&i<v[0].length();i++) {
			boolean g=true;
			for(int a=0;a<t;a++) {
				
				if(v[a].charAt(i)==35) {
					g=false;
					break;
				}
			}
			if(g) {
				for(int a=0;a<t;a++) {
					StringBuffer str = new StringBuffer(v[a]);
					str.deleteCharAt(i);
					v[a]=str.toString();
				}
				i--;
			}
			
		}
		
		for(String f:v) {
			if(f==null)continue;
			p(f);
		}
		
		
		
		
		
	}
	
	
	
	
	/*static boolean v(int i,long sum1,long sum2) {
		if(i==N) {
			long b=Math.abs(sum1-sum2);
			if(b==0) {
				if(sum1<=K) {
					return true;
				}else return false;
			}else if(b%D==0) {
				if(Math.max(sum1, sum2)<=K)return true;
				else return false;
			}
			else return false;
		}
		
		if(v(i+1,sum1,sum2+v[i]%D))return true;
		
		if(v(i+1,sum1+D-v[i]%D,sum2))return true;
		return false;
		
	}*/
	
	
	
	
	

	


	
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
	
