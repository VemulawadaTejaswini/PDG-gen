import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int Y = sc.nextInt();
        int U = sc.nextInt();
//        int[] a = new int[T];
//        for (int i = 0; i < T; i++) {
//            a[i] = sc.nextInt();
//        }
        //System.out.println(IntStream.of(a).reduce(0,(right,left) -> right + left -1));
        //System.out.println(IntStream.rangeClosed(1,100).filter(c -> c % 2 == 0).sum());

        System.out.println((Math.abs(Y-U))%2==0 ? "Arice" :"Boyrs");

    }
}
