import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        long[] T = new long[N];
        long max = 0;

        for(int i=0; i<N; i++){
            T[i] = sc.nextLong();
            max = Math.max(max, T[i]);
        }

        loop:for(int i=1; i<=1000000000000000000L; i++){
            for(int j=0; j<N; j++){
                if(max*i%T[j]!=0){
                    break;
                }
                if(j==N-1){
                    System.out.println(max * i);
                    break loop;
                }
            }
        }
    }
}