
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);


	    int N=gi();
	    int[] A=new int[N];
	    LinkedList<Integer> l = new LinkedList<Integer>();

        for (int i=0; i<N; i++) {
            A[i]=gi();
            if(i%2==0) {
            	l.offerFirst(A[i]);
            } else {
            	l.offerLast(A[i]);
            }
        }
        
        if(N%2==0)Collections.reverse(l);
        System.out.print(l.get(0));
        for(int i=1; i<N;i++) {
        	System.out.print(" " + l.get(i));
        }



        //System.out.println(Math.min(mp[N], pm[N]));

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