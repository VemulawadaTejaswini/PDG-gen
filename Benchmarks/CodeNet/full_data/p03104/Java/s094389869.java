import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long res = A;
        for(long i = A + 1; i <= B; i++){
           res = res ^ i;
        }
        System.out.println(res);

    }

}