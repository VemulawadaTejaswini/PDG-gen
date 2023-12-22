
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);


	    int N=gi();
	    char[][] cs=new char[N][26];
        for (int i=0; i<N; i++) {
            String s=gs();
            for (int j=0; j<s.length(); j++) {
            	char c= s.charAt(j);
            	cs[i][c-97]++;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<26; i++) {
        	int min=Integer.MAX_VALUE;
        	for (int j=0; j<N; j++) {
                if(min>cs[j][i]) {
                	min=cs[j][i];
                }
            }
        	char c=(char)(97+i);
        	sb.append(String.join("", Collections.nCopies(min, String.valueOf(c))));
        }

        System.out.println(sb.toString());

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