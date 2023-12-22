import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Hi = new int[N];
        int max = 0;
        int cnt = 0;
        for (int i=0; i<N; i++) {
            Hi[i] = sc.nextInt();
            if (Hi[i] >= max) {
                cnt++;
                max = Hi[i];
            }
        }


        System.out.println(cnt);
    }
}
