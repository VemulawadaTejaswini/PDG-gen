import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] result = new int[N];
        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            result[A - 1] = i + 1;
        }
        for(int i = 0; i < N; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
