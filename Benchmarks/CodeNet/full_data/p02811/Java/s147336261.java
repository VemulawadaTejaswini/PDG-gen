import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(k * 500 < x ? "No" : "Yes");
        sc.close();

    }

}
