
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

	static int mod=1000000007;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ns();
		String str=ns();

		solve(str);

	}


	private static int helper(int a) {
		int all=0;
		int a1=1;
		int a2=1;
		int b1=1;
		while(a!=0) {
			a1=a1*a;
			a2=a2*b1;
			b1++;
			int tmp=a1/a2;
			a--;
			all=(all+tmp)%mod;
		}
		return all;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void solve(String str) {
		// TODO Auto-generated method stub
		int count=helper(str.length());
		Map<Character,Integer> m=new HashMap();
		for(char c:str.toCharArray()) {
			int k=m.getOrDefault(c, 0)+1;
			m.put(c,k);
		}
		int res=str.length();
		for(char c:m.keySet()) {
			if(m.get(c)==1)
				m.remove(c);
		}
		int count2=1;
		int sum1=0;
		for(char c:m.keySet()) {
			sum1+=m.get(c);
			count2=count2*(1+m.get(c));
		}
		int number3=helper(sum1)-count2+1;
		int number4=helper(str.length()-sum1)+1;
		 number3=number3*number4;
		 System.out.println(count-number3);

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
