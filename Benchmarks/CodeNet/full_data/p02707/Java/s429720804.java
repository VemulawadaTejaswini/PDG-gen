import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N-1];
        int ans[] = new int[N-1];
        for(int i=0;i<N-1;i++)
        {
            A[i] = sc.nextInt();
        }
        for(int i=0;i<N-1;i++)
        {
            ans[A[i]]++;
        }
        for(int i=1;i<N-1;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
