import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long saishoko = 1;
        for (int i = 0; i < n; i++) {
           saishoko = lcm(saishoko,a[i]);
        }

        long tmpsum = 0;
        for (int i = 0; i < n; i++) {
            tmpsum += saishoko / a[i];
        }

        System.out.println((double)saishoko / tmpsum);




    }

    static int lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (int)(c/b);
    }

}
