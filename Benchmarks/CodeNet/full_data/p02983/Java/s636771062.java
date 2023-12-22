import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        int l=L;
        int S=0;
        int G=0;
        int F=0;
        for(int i=1;i<R-L; i++){
            G=G+i;
        }
        Integer A[]=new Integer[G];
        for(int i=L; i<R; i++){
            for (int j=L+1; j<=R; j++) {
                S=i*j;
                A[F]=S%2019;
                F++;
            }
        }
        Arrays.sort(A);
        System.out.println(A[0]);
    }
}
