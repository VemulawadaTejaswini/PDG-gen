import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        int S1=L;
        int C=R-L;
        int C1=C+1;
        Integer A[]=new Integer[C1*C/2];
        int i=0;
        for (S1=L; S1<=R; S1++){
            for (int S2=S1+1; S2<=R; S2++){
                int S3=S1*S2;
                A[i]=S3%2019;
                i++;
            }
        }
        Arrays.sort(A);
        System.out.println(A[0]);
    }
}
