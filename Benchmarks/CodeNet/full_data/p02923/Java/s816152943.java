import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] H = new int[N];
        for(int i = 0; i < N; i++){
            H[i] = sc.nextInt();
        }
        sc.close();
        if(N!=1){
        int[] a  = new int[N-1];
        for(int i = 0; i < N-1; i++){
            if(i==0){
                if(H[i] >= H[i+1])
                    a[i] = 1;
                else
                    a[i] = 0;
            } else {
                if(H[i] >= H[i+1])
                    a[i] = a[i-1]+1;
                else
                    a[i] = 0;
            }
        }
        Arrays.sort(a);
        System.out.println(a[N-2]);
    } else
        System.out.println(0);
    }
}