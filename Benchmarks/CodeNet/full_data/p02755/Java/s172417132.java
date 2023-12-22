import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = -1;
        for(int i = 1; i < 1250; i++) {
            if((int)(i * 0.08) == a && (int)(i * 0.1) == b) {
                result = (int) (b / 0.1);
            }
        }
        System.out.println(result);
    }
}