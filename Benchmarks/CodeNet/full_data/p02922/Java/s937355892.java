import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;
        if (a > b) {
            answer = -1;
        }
        if (a <= b) {
            b = b - a;
            a = a - 1;
            answer++;
        }
        while (0 < b) {
            answer++;
            b = b - a;
        }
        System.out.println(answer);
    }

}
