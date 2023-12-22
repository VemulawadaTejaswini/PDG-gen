import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();
        Boolean[][] array = IntStream.range(0, height).mapToObj(i -> scanner.next().chars().mapToObj(c -> c == '#').toArray(Boolean[]::new)).toArray(Boolean[][]::new);

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[0].length; y++) {
                if (array[x][y]) {
                    boolean temp = false;
                    try {
                        if (array[x - 1][y]) temp = true;
                    } catch (ArrayIndexOutOfBoundsException e) {}
                    try {
                        if (temp || array[x + 1][y]) temp = true;
                    } catch (ArrayIndexOutOfBoundsException e) {}
                    try {
                        if (temp || array[x][y - 1]) temp = true;
                    } catch (ArrayIndexOutOfBoundsException e) {}
                    try {
                        if (temp || array[x][y + 1]) temp = true;
                    } catch (ArrayIndexOutOfBoundsException e) {}

                    if (!temp) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}