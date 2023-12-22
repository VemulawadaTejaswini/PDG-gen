import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int ans = 0;
        int x = 0;

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        loop:for(int i=1; i<N; i++){
            for(int j=x; j<N; j++){
                if(a[j]==i){
                    x = j + 1;
                    break;
                }
                else if(a[j]!=i){
                    ans += 1;
                }
                if(j==N-1){
                    break loop;
                }
                if(ans==N-1){
                    ans = -1;
                    break loop;
                }
            }
        }
        System.out.println(ans);
    }
}