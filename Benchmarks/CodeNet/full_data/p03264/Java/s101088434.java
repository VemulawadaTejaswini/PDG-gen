import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int odd = (k + 1) /2;
        int even = k / 2;
        System.out.println(odd * even);
    }
}
