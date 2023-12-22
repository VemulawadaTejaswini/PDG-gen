import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        List<Long> list = new LinkedList<>();
        for (long i=a; i<=b; i++) {
            list.add(i % 2019);
        }

        Collections.sort(list);

        System.out.println(list.get(0) * list.get(1));
    }
}
