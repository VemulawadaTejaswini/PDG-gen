import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float result = 0;
        for  (int i =0; i<N; i++) {
            float x = sc.nextFloat();
            String u = sc.next();

            if (u.equals("JPY")) {
                result += x;
            }
            else {
                result += (x*380000);
            }
        }
        System.out.println(result);
    }
}