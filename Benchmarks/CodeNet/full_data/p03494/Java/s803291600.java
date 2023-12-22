import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        boolean flg = true;
        int count = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        while(flg) {
            boolean existOdd = false;
            for(int i = 0; i < N; i++) {
                if(arr[i] % 2 != 0){
                    flg = false;
                }
            }
            if(!flg) break;

            for(int j = 0; j < N; j++) {
                arr[j] = arr[j] / 2;
            }
            count++;
        }
        System.out.println(count);
    }
}
