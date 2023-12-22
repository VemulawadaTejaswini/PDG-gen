import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cityNum = sc.nextInt();
        int roadNum = sc.nextInt();
        sc.nextLine();

        ArrayList<Integer> patterns = new ArrayList<>();
        for(int i=0; i<roadNum*2; i++) {
            patterns.add(sc.nextInt());
        }
        sc.nextLine();

        Set<Integer> uniquePatterns = new HashSet<>(patterns);
        for(Integer ii: uniquePatterns) {
            System.out.println(Collections.frequency(patterns,ii));
        }
    }
}
