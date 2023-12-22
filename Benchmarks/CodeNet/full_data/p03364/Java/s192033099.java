import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][n];
        for(int i=0; i<n; i++) {
            a[i] = sc.next().toCharArray();
        }

        int res = 0;

        OUTER: for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    if(a[(j+i)%n][k] != a[(k+i)%n][j]) {
                        continue OUTER;
                    }

                }
            }
            res ++;
        }
        System.out.println(res * n);
    }

}
