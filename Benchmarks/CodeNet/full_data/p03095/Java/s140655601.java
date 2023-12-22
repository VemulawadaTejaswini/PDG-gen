
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
	//static Scanner sc = new Scanner(System.in);
	static Properties pps = System.getProperties();
	static boolean dbg = true;

	static int mod=1000000007;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		List<Character> l=new ArrayList<Character>();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		int str=Integer.parseInt(sc.readLine());
		
		for(int i=0;i<str;i++) {
			char c=(char) sc.read();
			l.add(c);
	
		}
		

		solve(l);

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void solve(List<Character> l) {
		// TODO Auto-generated method stub
		int count=helper(l.size());
		Map<Character,Integer> m=new HashMap();
		for(char c:l) {
			int k=m.getOrDefault(c, 0)+1;
			m.put(c,k);
		}

		
		
		
		List<Character> ll=new ArrayList();
		
		for(char c:m.keySet()) {
			if(m.get(c)==1)
				ll.add(c);
				
		}
		for(char c:ll)
			m.remove(c);
		int count2=1;
		int sum1=0;
		for(char c:m.keySet()) {
			sum1+=m.get(c);
			count2=count2*(1+m.get(c));
		}
		int number3=helper(sum1)-count2+1;
		int number4=helper(l.size()-sum1)+1;
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

	
}
