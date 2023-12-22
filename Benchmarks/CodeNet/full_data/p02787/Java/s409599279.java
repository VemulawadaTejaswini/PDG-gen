import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] MP = new int[H+1];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        for(int i=0;i<=H;i++){
            MP[i] = Integer.MAX_VALUE;
        }
        MP[0]=0;
        for(int i=1;i<=H;i++){
            for(int j=0;j<N;j++){
                if(i-A[j]<=0){
                    MP[i] = Math.min(B[j], MP[i]);
                }else{
                    MP[i] = Math.min(B[j] + MP[i-A[j]], MP[i]);
                }
            }
        }
        System.out.println(MP[H]);
    }
}
