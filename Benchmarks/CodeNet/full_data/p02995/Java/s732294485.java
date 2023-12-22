import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        

        long result = 0;
        for (long tmp = a; tmp <= b ; tmp++) {
            if(tmp % c != 0 && tmp % d !=0){
                result++;
            }
        }
        
        System.out.println(result);
    }
}
