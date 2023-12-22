import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K=scan.nextInt();
        int N=scan.nextInt();
        int r= (int) (K/(2*3.14));
        int A=0;
        for(int i=0;i<N;i++) {
            A = scan.nextInt();
            A = A+A;
        }
        System.out.println(A/r);
    }
}
