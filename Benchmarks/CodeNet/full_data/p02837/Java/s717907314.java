
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int N=gi();
        int[] A=new int[N];
        int[][] X =new int[N][N-1];
        int[][] Y =new int[N][N-1];

        for (int i=0; i<N;i++) {
        	A[i]=gi();
        	for (int j=0; j<A[i];j++) {
            	X[i][j]=gi();
            	Y[i][j]=gi();
            }
        }

        int max=0;
        for (int i=0; i<Math.pow(2, N);i++) {
        	boolean flg=true;
        	for (int j=0; j<N;j++) {
        		for (int k=0; k<A[j];k++) {
        			if(((i>>j) & 1) ==1) {
        			    int y = (i >> (X[j][k]-1)) & 1;
        		        if(y!=Y[j][k]) {
        		    	   flg=false;
        		    	    break;
        		        }
        			}
        		}
        		if(!flg)break;
        	}
        	if(flg) {
        		int c=0;
        		int d=i;
        		while(d>0) {
        			if(d%2==1) {
        				c++;
        				d= (d-1)/2;
        			}else {
        				d =d/2;
        			}
        		}
        		if (c>max) {
        			max=c;
        		}
        	}
        }

        //System.out.println("No");

        System.out.println(max);
	}


	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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