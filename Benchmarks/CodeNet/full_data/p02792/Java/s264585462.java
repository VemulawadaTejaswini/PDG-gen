import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
//map.containsKey(A)
//Map<String, Integer> map = new HashMap<String, Integer>(n);
//ArrayList<String> cc = new ArrayList<>(n);
//Collections.sort(list);
//Array.sort(list);
//Arrays.asList(c).contains("a")

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	//static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	
	public static void main(String[] args) {
	int n=sc.nextInt();
	String s=""+n;
	int t=s.length();
	int nn[][]=new int[9][9];
	long ans=0;
	//t-1桁までは固定
	//1桁の時9
	//2桁の時81
	//3桁の時729
	//4桁の時656
	String tmp;
	for(int i=1;i<=n;i++) {
		if(i%10==0)continue;
		tmp=Integer.toString(i);
		//p(i);
		int a=tmp.charAt(0)-49;
		int b=tmp.charAt(tmp.length()-1)-49;
		nn[a][b]++;
	}
	//1 0(2 1)
	for(int a=0;a<9;a++) {
		for(int b=0;b<9;b++) {
			int ttt=0;
			//p(a+"      "+b);
			//p("nn"+nn[a][b]);
			ans+=nn[a][b]*nn[b][a];
			ttt+=nn[a][b]*nn[b][a];
			//p(a+"       "+b+"        "+ttt);
		}
	}
	p(ans);
	//2桁=2つ
	//３桁=18こ
	
	
	/*for(int a=1;a<=n;a++) {
		tmp1=""+a;
		for(int b=1;b<=n;b++) {
			tmp2=""+b;
			if(tmp1.charAt(0)==tmp2.charAt(tmp2.length()-1)) {
				if(tmp2.charAt(0)==tmp1.charAt(tmp1.length()-1)) {
					p(a+"     "+b);
					ans++;
				}
			}
		}
	}*/
	
 }
	static int dfs(int n) {
		int sss[]= {1,1,9,81,729};
		n--;
		if(n==0) {
			return 1;
		}
		
		
		return sss[n]+dfs(n);
	}
	static int Nc2(int v) {
		if(v-1<=0)return 0;
		return v*(v-1)/2;
	}
}
