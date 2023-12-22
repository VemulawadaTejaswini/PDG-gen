import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String ans = a + b;
        Integer ansInt = Integer.parseInt(ans);

        double sqrt = Math.sqrt(ansInt);

        if((int)sqrt*sqrt == ansInt){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
