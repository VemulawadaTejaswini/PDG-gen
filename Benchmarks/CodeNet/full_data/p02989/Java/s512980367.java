import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] d = new int[N];
        for(int i = 0; i < N; i++)
            d[i] = sc.nextInt();
        
        int max = 0;
        for(int i = 1; i <= (N/2); i++){
            max = max(d);
        }
        System.out.println(max - max(d));
        sc.close();
    }

    static int max(int[] a){
        int max = a[0];
        int index = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
                index = i;
            }
        }
        a[index] = 0;
        return max;
    }
}