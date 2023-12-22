import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        Long k = scanner.nextLong();

        Long x = n % k;
        System.out.println(Math.min(x, Math.abs(k-x)));

    }
}
