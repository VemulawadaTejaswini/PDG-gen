import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a >= 13) {
            System.out.println(b);
        } else if(a >= 6) {
            System.out.println(b / 2);
        } else {
            System.out.println(0);
        }
    }
}
