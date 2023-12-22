import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int monsters = sc.nextInt();
        int specialMoves = sc.nextInt();
        sc.nextLine();
        int[] healths = toArray(sc.nextLine());
        if(specialMoves >= monsters) System.out.println(0);
        else {
            long sum = Arrays.stream(healths).sorted().limit(monsters-specialMoves).mapToLong(i -> (long)i).sum();
            System.out.println(sum);
        }
    }

    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }

    private static int[] toArray(String text) {
        return Arrays.stream(text.split("\\s")).mapToInt(Integer::valueOf).toArray();
    }

}