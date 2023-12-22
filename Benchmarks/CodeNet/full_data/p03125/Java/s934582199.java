import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int A = sc.nextInt();
        final int B = sc.nextInt();

        final boolean isDivisor = B % A == 0;
        if (isDivisor){
            output(A+B);
        }else{
            output(B-A);
        }
    }

    private static void output(int i) {
        System.out.println(i);
    }
}
}
