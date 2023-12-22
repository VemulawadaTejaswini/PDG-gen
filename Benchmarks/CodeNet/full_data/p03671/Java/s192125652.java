import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[3];
        a[0] = scan.nextInt();
        a[1] = scan.nextInt();
        a[2] = scan.nextInt();
        
        Arrays.asList(a).sort(null);
        System.out.println(a[0] + a[1]);
    }
}