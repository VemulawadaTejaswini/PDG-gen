import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputAB = scan.nextLine().split(" ");
        Integer a = Integer.valueOf(inputAB[0]);
        Integer b = Integer.valueOf(inputAB[1]);

        List<Integer> results = new ArrayList<Integer>();
        results.add(a + b);
        results.add(a - b);
        results.add(a * b);
        results.sort(Comparator.reverseOrder());

        System.out.println(results.get(0));
        scan.close();
    }
}