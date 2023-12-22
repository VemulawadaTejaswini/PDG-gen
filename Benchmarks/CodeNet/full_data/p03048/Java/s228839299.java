import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int G = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();

        System.out.println( RGBBox(R,G,B,N));
    }

    public static int RGBBox(int r, int g, int b, int n) {
        int cnt=0;
        for( int i=0 ; i<=n ; i+=r ) {
            for( int j=0 ; j<=n-i ; j+=g ) {
                if( (n-i-j)%b == 0) {
                    cnt++;
                }

            }
        }

        return cnt;
    }

}