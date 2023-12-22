import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
//map.containsKey(A)
//Map<String, Integer> map = new HashMap<String, Integer>(n);
//ArrayList<String> cc = new ArrayList<>(n);

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	//static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	
	public static void main(String[] args) {
	int n=sc.nextInt();
	int k=sc.nextInt();
	Map<Integer, Integer> map = new HashMap<Integer, Integer>(n);
	boolean a=true;
	double p[]=new double[n];
	double tmp ;
	for(int i=0;i<n&&a;i++) {
		tmp= sc.nextInt();
		p[i]=(tmp+1)/2;
		p("pi..."+p[i]);
	}
	double f1=0;
	for(int i=0;i<k;i++) {
		f1+=p[i];
		p("f1"+f1);
}
	double max=f1;
	double f=f1;
	for(int i=0;i+k<=n-1;i++) {
		f=f-p[i]+p[k+i];
		p("f..."+max);
		if(max<f) {
			max=f;
			p("max"+max);	
		}
	}


	System.out.println(max);
	
	
	
 }
}