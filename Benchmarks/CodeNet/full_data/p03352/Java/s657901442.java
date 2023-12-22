import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double X = scanner.nextDouble();

        double doubleSqrt = Math.sqrt(X);
        int sqrt = (int) Math.floor(doubleSqrt);

        int ans = 1;

        if (sqrt<2){
            System.out.println(ans);
            return;
        }

        for (int i = 2; i <= sqrt; i++) {
            int accum = i;
            while (true){
                accum*=i;
                if (accum>X){
                    break;
                }
                if (ans<accum) ans = accum;
            }
        }
        System.out.println(ans);

        scanner.close();
    }
}
