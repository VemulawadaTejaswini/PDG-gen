import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]A = new int[N+1];
        int[]ans=new int[N+1];
        A[0]=0;
        for(int i=2;i<=N;i++){
            A[i]=sc.nextInt();
        }
        for(int i=2;i<=N;i++){
            ans[A[i]]++;
        }
        for(int i=1;i<=N;i++){
            System.out.println(ans[i]);
        }
}
}