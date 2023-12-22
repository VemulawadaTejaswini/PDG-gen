import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        long a = s.nextInt();
        long b = s.nextInt();

        long ans = 0;
        if ((a * b)%2 == 0) {
            ans = (a * b)/2;
        } else {
            ans = (a * b)/2 + 1;
        }

        if (a == 1 || b == 1) {
            ans = 1;
        }

        System.out.println(ans);
    }
}