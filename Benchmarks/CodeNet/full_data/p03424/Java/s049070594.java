import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        ArrayList<String> List = new ArrayList<String>();
        for (int a = 0; a < N; a++) {
            List.add(sc.next());
        }
        if (Arrays.asList(List).contains("Y")) {
            System.out.println("three");
        } else {
            System.out.println("four");
        }
    }
}