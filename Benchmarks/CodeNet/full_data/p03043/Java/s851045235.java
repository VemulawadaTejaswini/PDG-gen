import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();

        double result = 0.0000000000;
        int j = 1;
        for (int i = n; i > 0; i--) {
            int point = (int) (i * Math.pow(2, j - 1));
            while (point < k) {
                point *= 2;
                j++;
            }
            result += Math.pow(0.5, j - 1) / n;
        }
        System.out.println(String.format("%.11f", result));
    }
}