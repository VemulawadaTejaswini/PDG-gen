import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = 0;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr;
        arr = new int[N];
        for(int i = 0; i<N;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>=K){
                C++;
            }
        }
        System.out.println(C);
    }
}
