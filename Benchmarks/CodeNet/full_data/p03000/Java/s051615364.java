import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int sumN = 1;
        int prevL = 0;

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        for (int i = 0 ; i < n + 1 ; i ++) {
            int l = Integer.parseInt(sc.next());
            sum = prevL + l;
            if (sum > x) {
                sumN = i + 1 ;
                break;
            }
            prevL = sum;
        }
        System.out.print(sumN);
    }
}