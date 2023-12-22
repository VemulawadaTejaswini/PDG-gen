import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long count = (n-n%(a+b))/(a+b);
        long instance = n%(a+b);
        count *= a;
        if (instance<=a){

            count += instance;
        }else{
            count += a;
        }
        System.out.println(count);
    }

}