import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();
        if(N==K)
            System.out.println(1);
        else{
            if((N-1)%(K-1) == 0)
                System.out.println(N/(K-1));
            else
                System.out.println(N/(K-1) + 1);
        }
    }

    static int min_index(int[] a){
        int index = 0;
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
                index = i;
            }
        }
        return index;
    }
}