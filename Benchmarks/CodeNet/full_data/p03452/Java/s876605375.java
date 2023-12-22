import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int [][] LR = new int[N][N];
            for (int i=0; i<N; i++)
                for (int j=0; j<N; j++) LR[i][j] = -0;
            for (int i=0; i<M; i++){
                int l= scanner.nextInt();
                int r= scanner.nextInt();
                int d= scanner.nextInt();
                LR[l-1][r-1]=d;
            }
            Boolean OK=false;
            for (int i=0; i<N; i++){
                for (int k=0; k<N; k++){
                    int d1=LR[i][k];
                    int d2=0;
                    for (int j=0; j<i; j++)
                         d2 += LR[i][j];
                    if (d1 == d2) OK=true;
                    else          OK = false;
                }
            }
            if (OK) System.out.println("Yes");
            else System.out.println("No");
        }
}