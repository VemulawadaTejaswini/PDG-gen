import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int result = 0;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int count = half(num);
            if (result == 0) {
                result = count;
            }
            if (count == 0) {
                result = 0;
                break;
            }
            if (count < result) {
                result = count;
            }
        }
        sc.close();
        System.out.println(result);
    }


    public static int half(int num) {
        int count = 0;
        while ((num % 2) == 0) {
            num = num / 2;
            count++;
        }
        return count;
    }
}
