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
	static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	
	
	
	public static void main(String[] args) {
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		
		int N=sc.nextInt();
		int A=sc.nextInt()-1;
		int B=sc.nextInt()-1;
		int C =sc.nextInt()-1;
		int D=sc.nextInt()-1;
		StringBuffer S = new StringBuffer(sc.next());
		
		if(D<C) {
			if(S.indexOf("...",B)==-1||S.lastIndexOf("...",D)==-1) {
				p("No");
			}else p("Yes");
				
		}else {
			if(S.indexOf("##",A)==-1||S.indexOf("##")>D) {
				p("Yes");
			}else {
				p("No");
			}
		}
		
		
		
		

		
	
		
		
	}



	
	
	
	

	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
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
	
