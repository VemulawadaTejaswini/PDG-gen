import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int sol = 0;
        for(int i = 1; i <= N; i++) {
            if(numNonZero(i) == K) {
                sol++;
            }
        }
        System.out.println(sol);
    }

    public static int numNonZero(int num) {
        int answer = 0;
        while(num != 0) {
            if(num % 10 != 0) {
                answer++;
            }
            num = num/10;
        }
        return answer;
    }
}
