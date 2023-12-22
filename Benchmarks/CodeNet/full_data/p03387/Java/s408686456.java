import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] L = new int[3];
        Arrays.setAll(L, i -> sc.nextInt());
        Arrays.sort(L);
        int res = L[2] - L[1];
        L[1] = L[2];
        L[0] += res;
        int inc = (int)Math.ceil((double)(L[2] - L[0]) / 2.0);
        res += inc;
        L[0] += inc * 2;
        if(L[0] > L[1]) res++;
        System.out.println(res);
    }
}
