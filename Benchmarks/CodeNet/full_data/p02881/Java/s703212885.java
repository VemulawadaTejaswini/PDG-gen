import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> list = new ArrayList<>();
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0)list.add((i+n/i));
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(0)-2);
    }
}
