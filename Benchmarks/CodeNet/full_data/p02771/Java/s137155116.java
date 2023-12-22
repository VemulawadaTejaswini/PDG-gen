import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Set<Integer> checkHash = new HashSet<>();
        checkHash.add(a);
        checkHash.add(b);
        checkHash.add(c);

        if (checkHash.size()==2){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


    }
}
