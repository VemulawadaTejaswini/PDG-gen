import java.util.*;

public class Main {
    private static final long MODVAL = 1000000007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = (a * (a-1))/2 + (b * (b-1))/2;
        System.out.println(result);
     }
}
