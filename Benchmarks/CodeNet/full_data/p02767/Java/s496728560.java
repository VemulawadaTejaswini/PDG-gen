import java.util.Scanner;

public class Main {

    public static String converter(String number, int base, int dest){
        return Integer.toString(Integer.parseInt(number, base), dest);
    }

    private static int converter(String number, int dest){
        return converter(number, 10, dest).length();
    }

    private static int stamina(int[] A, int n){
        int res = Integer.MAX_VALUE;
        for(int p = 1; p <= 1000; p++){
            int sum = 0;
            for(int a: A){
                sum += ((a - p) * (a - p));
            }
            res = Math.min(sum, res);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dest = new int[n];
        for(int i = 0; i < n; i++){
            dest[i] = scanner.nextInt();
        }
        System.out.println(stamina(dest, n));
    }
}
