import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        for(int i = 0; i < M; i++){
            A[i] = sc.nextInt();
        }
        int a = N;
        for(int i = 0; i < M; i++){
            a = a - A[i];
        }
        if(a < 0){
            System.out.println(-1); 
        }else{
            System.out.println(a);
        }
    }
} 