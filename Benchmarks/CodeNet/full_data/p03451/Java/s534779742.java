import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int [][] A = new int[2][N];
            for (int i=0; i<2; i++)
                for (int j=0; j<N; j++)
                    A[i][j] = scanner.nextInt();
            int i=2-1;
            int j=N-1;
            int Point = A[i][j];
            while ((0<i) || (0<j)){
                if (i<1) j--;
                else if (j<1) i--;
                else if (A[i-1][j] > A[i][j-1]) i--;
                else j--;
                Point += A[i][j]; 
                //System.out.println("i="+i+"  j="+j);
            }
            //System.out.println("Point="+Point);
            i=0;
            j=0;
            int Point2 = A[0][0];
            while ((i<1) || (j<(N-1))){
                if (i>=1) j++;
                else if (j>=(N-1)) i++;
                else if (A[i+1][j] > A[i][j+1]) i++;
                else j++;
                Point2 += A[i][j]; 
                //System.out.println("i="+i+"  j="+j);
            }
            if (Point < Point2) System.out.println(Point2);
            else System.out.println(Point);
        }
}