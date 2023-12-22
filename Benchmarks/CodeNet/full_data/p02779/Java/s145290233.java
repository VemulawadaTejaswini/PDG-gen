
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        HashSet<Long> hs = new HashSet<>();
        for(int i = 0; i < n; i++){
            long a = sc.nextInt();
            if(hs.contains(a)){
                System.out.println("No");
                break;
            }
            hs.add(a);
        }
        System.out.println("Yes");
    }
}