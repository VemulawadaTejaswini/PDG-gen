import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.next());
        int a = Integer.parseInt(scan.next());

        int count = 0;
        while(h > 0) {
            h = h-a;
            count++;
        }

        System.out.println(count);
    }
}