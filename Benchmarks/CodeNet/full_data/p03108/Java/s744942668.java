
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Properties pps = System.getProperties();
	static boolean dbg = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a=ni(2);
		int[][] b=ni(a[1],2);

		solve(a,b);

	}



	private static void solve(int[] a, int[][] b) {
		// TODO Auto-generated method stub
		Map<Integer,Set<Integer>> m=new HashMap();

		for(int i=1;i<=a[0];i++){
			Set<Integer> s=new HashSet();
			s.add(i);
			m.put(i,s);

		
		}
		
		

 		Stack<Long> s=new Stack();
 		long k=(long)a[0]*(long)(a[0]-1)/2;
 
 		s.add(k);
 		for(int i=b.length-1;i>0;i--) {
 			long tmpl=0;
 			Set<Integer> tmp=m.get(b[i][0]);
 			tmp.addAll(m.get(b[i][1]));
 			for(Integer tmpi:tmp)
 				m.put(tmpi,tmp);
 			int count=a[0];
 			Map<Integer,Integer> tmpM=new HashMap<Integer,Integer>();
 			Set<Integer> tt=new HashSet<Integer>();
 			for(Integer tmpi:m.keySet()) {
 				if(!tt.contains(tmpi)) {
 					tmpl+=(long)(count-m.get(tmpi).size())*m.get(tmpi).size();
 					count=count-m.get(tmpi).size();
 					tt.addAll(m.get(tmpi));
 				}
 				
 			}

 			s.push(tmpl);
 		}
 		while(!s.isEmpty())
 			System.out.println(s.pop());
		
		
		
	}



	public static void out(String str) {

		if (dbg)
			System.out.println(str);
	}

	public static void out(int str) {

		if (dbg)
			System.out.println(str);
	}

	public static int ni() {
		sc.nextLine();
		return sc.nextInt();

	}

	public static String ns() {

		return sc.nextLine();
	}

	public static int[] ni(int k) {
		int[] res = new int[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextInt();
		sc.nextLine();
		return res;
	}

	public static String[] ns(int k) {
		String[] res = new String[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextLine();
		return res;
	}

	public static int[][] ni(int a, int b) {
		int[][] res = new int[a][b];
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				res[i][j] = sc.nextInt();
		sc.nextLine();
		return res;
	}
}
