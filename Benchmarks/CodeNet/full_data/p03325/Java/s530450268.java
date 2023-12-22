import java.util.Scanner;

/*
各要素が2で何回割れるか
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 0;
        for(int i = 0; i < N; i++) {
            int tmp = arr[i];
            while(tmp > 0) {
                if(tmp%2 == 0) {
                    res++;
                    tmp /=2;
                } else {
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
