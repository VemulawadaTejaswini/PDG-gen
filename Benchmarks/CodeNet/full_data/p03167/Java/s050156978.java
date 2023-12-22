import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int mod = (int)Math.pow(10, 9) + 7;
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        List<String> grid = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            grid.add(scanner.next());
        }
        int curent[] = new int[cols+1];
        int previous[] = new int[cols+1];
        previous[cols-1] = 1;
        for (int i = rows-1; i >= 0; i--) {
            for (int j = cols-1; j >= 0; j--) {
                if (grid.get(i).charAt(j) == '#') {
                    curent[j] = 0;
                    continue;
                }
                curent[j] = (curent[j+1]%mod + previous[j]%mod)%mod;
            }
            int temp[] = curent;
            curent = previous;
            previous = temp;
        }
        System.out.println(previous[0]);
    }
}
