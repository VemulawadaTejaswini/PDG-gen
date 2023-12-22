import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        a[0] -= a[2];
        int w = a[1] + a[2];
        System.out.println(a[0] / w);
    }
}
