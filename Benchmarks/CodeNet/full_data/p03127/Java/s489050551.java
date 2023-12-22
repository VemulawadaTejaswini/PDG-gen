import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        System.out.println(minHP(A));
    }

    public static int minHP(int[] A){
        int min1 = Math.min(A[0], A[1]),
        min2 = Math.max(A[0], A[1]);
        for(int i = 2; i < A.length; i++){
            int value = A[i];
            if(value < min1){
                min2 = min1;
                min1 = value;                
            } else if(value < min2){
                min2 = value;
            }
        }
        return gcd(min1, min2);
    }

    public static int gcd(int a, int b){
        int r;
        while((r = b%a) > 0){
            b = a;
            a = r;
        }
        return a;
    }    
}