import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int count = 0;
        for(int i =0; i < N; i++){
            A[i] = sc.nextInt();
                while(A[i]%2 == 0){
                A[i] = A[i]/2;
                count += 1;
                }
        }
        System.out.println(count);
    }
}
