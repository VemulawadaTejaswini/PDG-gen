

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);


	    int N=gi();
	    Map<Integer, Long> m=new HashMap<Integer, Long>();

        for (int i=1; i<=N; i++) {
        	List<Integer> l=insuB(i);
            for (Integer n : l) {
            	if (m.containsKey(n)) {
            		m.put(n, m.get(n)+1);
            	} else {
            		m.put(n, 1l);
            	}
            }
        }
        
        long ans =1;
        for (Map.Entry<Integer, Long> e : m.entrySet()) {
        	ans*=(e.getValue()+1);
        	ans=ans%1000000007;
        }

        System.out.println(ans);

//        if(ans==0) {
//
//		    System.out.println("Yes");
//        } else {
//        	System.out.println("No");
//
//        }
	}

	public static List<Integer> insuB(int n) {
		List<Integer> l=new ArrayList<Integer>();
		int i=2;
		while(n!=1) {
			if (n%i==0) {
				l.add(i);
				n/=i;
			} else {
				i++;
			}
		}
		return l;
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