import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int answer = 0;
        int c=0;
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
            if (i >= 1) {
                if (b[i - 1] - b[i] >= 0) {
                    answer++;
                    c=answer;
                } else {
                    answer = 0;
                }
            }
        }
        System.out.println(Math.max(answer, c));
    }
}
