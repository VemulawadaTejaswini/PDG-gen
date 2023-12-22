import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Z = sc.nextInt();
        int W = sc.nextInt();
        int[] A = new int[N+1];
        for(int i=1;i<=N;i++){
            A[i] = sc.nextInt();
        }
        int ans = Math.max(Math.abs(A[N]-A[N-1]),Math.abs(A[N]-W));
        System.out.println(ans);
    }
}
