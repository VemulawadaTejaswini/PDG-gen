import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	private int n , x, cnt = 0;
	private Vector<char[]> lst = new Vector<>();
	Scanner sc = new Scanner(System.in);
	
	void run() {
		init();
		make();
		count();
		System.out.println(cnt);
	}
	

	
	void print(char[] x) {
		System.out.print(String.valueOf(x));
		System.out.println();
	}
	
	void init() {
		int c = 0 ; x = sc.nextInt();
		int ct = x;
		while(ct > 0) {
			c++ ; ct/=10;
		}
		this.n = c ;
	}
	
	void make() {
		for(int i=3;i<=n;i++) {
			rec(0,i,new char[n]);
		}
	}
	void rec(int i,int n,char[]ch) {
		if(i==n) {
			char[] x = new char[n];
			for(int j=0;j<n;j++)x[j]=ch[j];
			lst.add(x);
			return;
		}
		ch[i]='3';
		rec(i+1,n,ch);
		
		ch[i]='5';
		rec(i+1,n,ch);
		
		ch[i]='7';
		rec(i+1,n,ch);
	}
	
	void count() {
		int j;
		for(char[] x :lst) {
			j = 0;
			for(int i=0;i<x.length;i++) {
				j += Character.getNumericValue(x[i]) * Math.pow(10, x.length-1-i);
			}
			if(j>this.x)return;
			cnt+=judge(x);
		}
	}
	
	int judge(char[] x) {
		int[] a = new int[3];
		for(char c : x) {
			switch(c) {
			case '3':a[0]++;break;
			case '5':a[1]++;break;
			case '7':a[2]++;break;
			}
		}
		for(int i:a) {
			if(i==0)return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}