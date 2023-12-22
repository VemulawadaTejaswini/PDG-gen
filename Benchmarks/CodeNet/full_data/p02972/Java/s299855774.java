import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N+1];
        int ansCount = 0;
        Vector<Integer> ans = new Vector<Integer>();
        for(int i=1;i<N+1;i++){
            A[i] = sc.nextInt();
        }

        for(int i=N;i > 0;i--){
            int count = 0;

            for(int j=2;i * j < N;j++){
                if(B[i * j] == 1){
                    count++;
                }
            }
            B[i] = (A[i] + count) % 2;
            ansCount += B[i];

        }
        System.out.println(ansCount);

        for(int i=0;i<N;i++){
            if(B[i] == 1){
                System.out.print(i + " ");
            }
        }



    }

}
