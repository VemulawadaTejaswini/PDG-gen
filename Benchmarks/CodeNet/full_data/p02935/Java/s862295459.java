
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        String[] values = sc.nextLine().split(" ");
        sc.close();

        int[] converted = Arrays.stream(values).mapToInt(Integer::parseInt).sorted().toArray();
        double v = (converted[0] + converted[1]) / 2.0;
        
        for (int i = 2; i < num; i++) {
            v = (v + converted[i]) / 2.0;
        }
        System.out.println(v);
    }
}