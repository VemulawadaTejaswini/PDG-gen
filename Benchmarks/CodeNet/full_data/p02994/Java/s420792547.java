import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        Integer l = scan.nextInt();
        Integer taste = IntStream.range(l, l + n).sum();

        Integer result;
        if(l >= 0) {
            result = taste - l;
        }
        else if(Math.abs(l) < n) {
            result = taste;
        }
        else {
            Integer tmp = IntStream.range(l, l + n)
                    .reduce(n + Math.abs(l), (i1,i2) ->
                            Math.abs(i1) > Math.abs(i2) ? i2 : i1);
            result = taste - tmp;
        }
        System.out.println(result);
        scan.close();
    }
}
