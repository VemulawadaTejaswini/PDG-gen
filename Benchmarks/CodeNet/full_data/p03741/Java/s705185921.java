
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);


	    int N=gi();
	    long[] A=new long[N+1];
	    long[] mp=new long[N+1];
	    long[] pm=new long[N+1];
	    long mpw=0;
	    long pmw=0;

        for (int i=1; i<=N; i++) {
            A[i]=gi();
        }

        for (int i=1; i<=N; i++) {
            if(i%2==1) {
            	if(mpw + A[i]>=0) {
            		mp[i]=mp[i-1]+ mpw+A[i]+1;
            		mpw=-1;
            	} else {
            		mp[i]=mp[i-1];
            		mpw=mpw + A[i];
            	}

            	if(pmw + A[i]<=0) {
            		pm[i]=pm[i-1]+ Math.abs(pmw+A[i])+1;
            		pmw=1;
            	} else {
            		pm[i]=pm[i-1];
            		pmw=pmw + A[i];
            	}
            } else {
            	if(mpw + A[i]<=0) {
            		mp[i]=mp[i-1]+ Math.abs(mpw+A[i])+1;
            		mpw=1;
            	} else {
            		mp[i]=mp[i-1];
            		mpw=mpw + A[i];
            	}

            	if(pmw + A[i]>=0) {
            		pm[i]=pm[i-1]+ pmw+A[i]+1;
            		pmw=-1;
            	} else {
            		pm[i]=pm[i-1];
            		pmw=pmw + A[i];
            	}
            }
        }

        System.out.println(Math.min(mp[N], pm[N]));

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