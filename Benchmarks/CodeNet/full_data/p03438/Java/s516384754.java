import java.util.Scanner;

public class Main {

 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int [] A = new int[N];
            for (int i=0; i<N; i++)
                A[i] = scanner.nextInt();
            int [] B = new int[N];
            for (int i=0; i<N; i++)
                B[i] = scanner.nextInt();
            long Pos=0;
            long Neg=0;
            for (int i=0; i<N; i++){
                int s=A[i]-B[i];
                if (s < 0){
                    Neg +=s;
                } else {
                    Pos +=s;
                }
            }
            long Judge = Neg + 2*Pos;
            if (Judge > 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            } 
        }
}