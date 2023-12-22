import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String string = scanner.next();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    hashSet.add(string.substring(i, i + 1) + string.substring(j, j + 1) + string.substring(k, k + 1));
                }
            }
        }
        System.out.println(hashSet.size());
    }
}
