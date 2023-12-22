import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[]A = new int[M];
        int count =0;
        for(int i=0;i<M;i++){
            A[i]=sc.nextInt();
            count+=A[i];
        }
        
        if(count>N)System.out.println(-1);
        else System.out.println(N-count);

    }
}