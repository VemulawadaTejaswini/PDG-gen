import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] B = new int[N];
        int colorCount = N-1;
        int min = 1000000001;
        Arrays.fill(B,-1);

        for(int i=0;i<N;i++){
            int A = sc.nextInt();
            if (A <= min){
                min = A;
                B[colorCount] = A;
                colorCount--;
            } else {
                for(int j=N-1;j > -1;j--){
                    if(A > B[j]){
                        B[j] = A;
                        j = -1;
                    }
                }
            }
        }
        System.out.println(N -1- colorCount);

    }

}
