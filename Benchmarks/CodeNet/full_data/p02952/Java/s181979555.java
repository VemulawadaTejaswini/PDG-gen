import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int answer = 0;
        for (int i=1; i<=N; i++) {
            if (String.valueOf(i).length() % 2 == 1) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
