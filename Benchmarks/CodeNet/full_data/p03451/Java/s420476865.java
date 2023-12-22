import java.util.Scanner;

public class Main {
 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int [][] A = new int[2][N];
            for (int i=0; i<2; i++)
                for (int j=0; j<N; j++)
                    A[i][j] = scanner.nextInt();
            int Point=0;
            for(int j=0; j<N; j++){
                int d= A[0][0];
                //System.out.println("================");
                for(int i=1; i<=j; i++){
                   // System.out.println("0-"+i+"="+A[0][i]);
                    d += A[0][i];
                }
                for(int i=j; i<N; i++){
                    //System.out.println("1-"+i+"="+A[1][i]);
                    d += A[1][i];
                }
                if (Point < d) Point=d;
            }
            System.out.println(Point);
        }
