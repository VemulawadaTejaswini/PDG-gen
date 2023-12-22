import java.util.Scanner;

public class Main {

    static class Data {
        int z;
        int o;
        int total;

        Data left;
        Data right;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();

        Data prev = null;
        Data current = new Data();
        Data largest = null;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                if (current.o != 0) {
                    prev = current;
                    current = new Data();
                    current.total = prev.o;
                    current.left = prev;
                    prev.right = current;
                }
                current.z++;
                current.total++;
            } else {
                current.o++;
                current.total++;
            }
            if (largest == null || largest.total < current.total) {
                largest = current;
            }
        }

        while (k != 1 && (largest.right != null || largest.left != null)) {
            k--;
            int left = largest.left == null ? 0 : largest.left.total + largest.o + largest.z;
            int right = largest.right == null ? 0 : largest.right.total + largest.total;

            if (left > right) {
                largest.left.o += largest.o + largest.z;
                largest.left.total += largest.o + largest.z;
                largest.left.right = largest.right;
                if (largest.right != null) largest.right.left = largest.left;
                largest = largest.left;
            } else {
                largest.right.o += largest.total;
                largest.right.total += largest.total;
                if (largest.left != null) largest.left.right = largest.right;
                largest.right.left = largest.left;
                largest = largest.right;
            }
        }
        System.out.println(largest.total);
    }
}