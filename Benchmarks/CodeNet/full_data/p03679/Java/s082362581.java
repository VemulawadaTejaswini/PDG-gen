import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String result = "";
        if (a >= b) {
            result = "delicious";
        } else if (x >= b - a) {
            result = "safe";
        } else if (x <= b - a) {
            result = "dangerous";
        }
        System.out.println(result);
    }
}
