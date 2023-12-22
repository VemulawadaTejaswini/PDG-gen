	import java.util.Scanner;

public class A_Multiple_of_2_and_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer;
        if (N % 2 == 0) {
            answer = N;
        } else {
            answer = N * 2;
        }

        System.out.println(answer);
    }
}
