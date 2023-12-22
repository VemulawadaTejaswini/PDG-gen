
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int N=gi();
        String s=gs();
        int[][] a=new int[10][10];

        long ans=0;
        for (int i=0; i<N;i++) {
        	int v1=Integer.parseInt(s.substring(i,i+1));
        	for (int j=i+1; j<N;j++) {
        		int v2=Integer.parseInt(s.substring(j,j+1));
            	if(a[v1][v2]==0) {
            		Set<Integer> l=new HashSet<Integer>();
            		for (int k=j+1; k<N;k++) {
            			int v3=Integer.parseInt(s.substring(k,k+1));
            			l.add(v3);
            		}
            		a[v1][v2]=l.size();
            	}
            }
        }

        for (int i=0; i<10;i++) {
        	for (int j=0; j<10;j++) {
            	ans+=a[i][j];
            }
        }

        System.out.println(ans);
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