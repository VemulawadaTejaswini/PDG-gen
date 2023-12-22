import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cityNum = sc.nextInt();
        int roadNum = sc.nextInt();

        ArrayList<Integer> patterns = new ArrayList<>();
        for(int i=0; i<roadNum*2; i++) {
            patterns.add(sc.nextInt());
        }
        System.out.println(java.util.Arrays.toString(patterns.toArray()));

        Collections.sort(patterns);
        System.out.println(java.util.Arrays.toString(patterns.toArray()));

        Set<Integer> uniquePatterns = new LinkedHashSet<>(patterns);
        System.out.println(uniquePatterns);
        for(Integer ii: uniquePatterns) {
            System.out.println(Collections.frequency(patterns,ii));
        }
    }
}
