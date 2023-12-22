import java.util.BitSet;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s1arr[] = s1.split(" ");
        int n = Integer.parseInt(s1arr[0]);
        int m = Integer.parseInt(s1arr[1]);
        int a[][] = new int[n][n];
        int b[][] = new int[m][m];
        BitSet bs = new BitSet(n * n);
        
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String strarr[] = str.split(" ");
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(strarr[j]);
            }
        }
        
        for (int i = 0; i < m; i++) {
            String str = sc.nextLine();
            String strarr[] = str.split(" ");
            for (int j = 0; j < m; j++) {
                b[i][j] = Integer.parseInt(strarr[j]);
            }
        }
        
        for (int i = 0; i < m - n; i++) {
            for (int j = 0; j < m - n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (a[i][j] == b[i + k][j + l]) {
                            bs.set(k + n * l);
                        }
                    }
                }
                if(bs.cardinality() == n*n){
                    System.out.println("Yes");
                    System.exit(0);
                }
                bs.clear();
            }
        }
        System.out.println("No");
    }
    
}