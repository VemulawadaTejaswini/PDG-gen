import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer a[] = new Integer[3];
        a[0] = scan.nextInt();
        a[1] = scan.nextInt();
        a[2] = scan.nextInt();
        
        List<Integer> l = Arrays.asList(a);
        l.sort(null);
        System.out.println(l.get(0) + l.get(1));
    }
}
