import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(call(1, 0, 0, 0, 0, n));

    }

    private static int call(int base, int c3, int c5, int c7, int num, int n) {
        int res = 0;
        if(c3>0 && c5>0 && c7>0 && num <= n) res++;
        if(base == 1000000000) return res;
        res += call(base * 10, c3 + 1, c5, c7, num + 3 * base, n);
        res += call(base * 10, c3, c5+1, c7, num + 5 * base, n);
        res += call(base * 10, c3, c5, c7+1, num + 7 * base, n);
        return res;
    }

}
