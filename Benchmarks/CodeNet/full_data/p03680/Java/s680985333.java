import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int ans = 1;

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }

        int x = a[0];
        for(int i=0; i<N; i++){
            ans += 1;
            x = a[x - 1];
            if(x==2){
                System.out.println(ans);
                break;
            }
            if(i==N-1){
                System.out.println(-1);
            }
        }
    }
}