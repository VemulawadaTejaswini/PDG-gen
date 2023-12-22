import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        long a[][] = new long[H - A][W];
        long b[][] = new long[A][W - B];
        long c = 1000000007;

        for(int i = 0 ; i < (H -A) ; i++){
            for(int j = 0 ; j < W ; j++){
                a[i][j] = (i == 0 || j == 0)? 1 : ((a[i][j-1] + a[i-1][j]) % c);
//                System.out.println(a[i][j]);
            }
        }

//        System.out.println(a[H - A - 1][B]);

        for(int i = 0 ; i < A ; i++){
            for(int j = 0 ; j < (W - B) ; j++){
                if(j == 0){
                    b[i][j] = (a[H - A - 1][B]) % c;
                }
                else if(i == 0){
                    b[i][j] = (a[H - A - 1][B + j] + b[0][j - 1]) % c;
                }

                else{
                    b[i][j] = (b[i][j-1] + b[i-1][j]) % c;
                }

//                System.out.println(b[i][j]);
            }
        }
        System.out.println(b[A - 1][W - B - 1]);
    }
}
