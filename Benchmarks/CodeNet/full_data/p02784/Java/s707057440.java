import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int h = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = toArray(sc.nextLine());
        int sum = Arrays.stream(a).sum();
        System.out.println((h-sum) > 0 ? "No" : "Yes");
    }

    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }

    private static int[] toArray(String text) {
        return Arrays.stream(text.split("\\s")).mapToInt(Integer::valueOf).toArray();
    }

}