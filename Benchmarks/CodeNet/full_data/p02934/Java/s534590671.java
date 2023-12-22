import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float answer = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            answer += (float) 1 / a;
        }
        answer = (float) 1/ answer;
        System.out.println(answer);
    }
}
