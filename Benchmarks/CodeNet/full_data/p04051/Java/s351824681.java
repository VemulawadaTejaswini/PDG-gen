import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] left = new int[n];
        int[] right = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++){
            left[i] = scanner.nextInt();
            right[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                result += Cab(left[i]+left[j],right[i]+right[j]);
            }
        }
        System.out.println(result);
    }
    public static int Cab(int a, int b) {
        return jc(a+b)/(jc(a)*jc(b));
    }
    // 阶乘
    public static int jc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = i * result;
        }
        return result;
    }
}