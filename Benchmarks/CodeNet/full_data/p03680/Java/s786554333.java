import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
        int[] A=new int[n];
        
        for(int i=0; i<n;i++) {
        	A[i]=gi();
        }
        Map<Integer,Integer> l=new HashMap<Integer,Integer>();
        int c=0;
        int q=1;
        while(true) {
        	l.put(q,q);
        	int a= A[q-1];
        	q=a;
        	c++;
        	if(q==2)break;
        	if (l.containsKey(q)) {
        		System.out.print(-1);
        		return;
        	}
        }
	   
	    System.out.print(c);

//        if (t.equals("Sunny")) {
//        	System.out.print("Cloudy");
//        }else if(t.equals("Cloudy")){
//        	System.out.print("Rainy");
//        } else {
//        	System.out.print("Sunny");
//        }


	}
	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}