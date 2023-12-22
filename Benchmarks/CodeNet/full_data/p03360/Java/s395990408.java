import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] ary = {a, b, c};
        Arrays.sort(ary);
        ary[2] *= Math.pow(2, k);
        System.out.println(Arrays.stream(ary).sum());
    }
}