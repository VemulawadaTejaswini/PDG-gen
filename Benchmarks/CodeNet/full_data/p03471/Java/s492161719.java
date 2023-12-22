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
	//static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	static int N;
	public static void main(String[] args) {
		
		N=sc.nextInt();
		long Y=sc.nextLong();
		
		
		int v =(int) (Y/10000);
		int v2=(int) ((Y%10000)/5000);
		int v3=(int) ((Y%10000)%5000/1000);
		
		if(N*10000<Y)p(-1+" "+-1+" "+-1);
		
		else if(xG(v,v2,v3,v+v2+v3)) {
			p(a+" "+b+" "+c);
		}else {
			p(-1+" "+-1+" "+-1);
		}
		
	}
	static int a,b,c;
	
	static boolean xG(int v1,int v2,int v3,int sum) {
		
		
		if(sum==N) {
			a=v1;b=v2;c=v3;
			return true;
		}
		if(sum>N)return false;
		
		if(v1!=0&&xG(v1-1,v2+2,v3,sum+1))return true;
		
		
		if(v1!=0&&xG(v1-1,v2,v3+10,sum+9)) return true;
	
		
		if(v2!=0&&xG(v1,v2-1,v3+5,sum+4))return true;
	
		
	
		return false;
		
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
	
