import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        int count = Integer.parseInt(values[0]);
        ArrayList<Integer> l1 = new ArrayList<>();
        line = scanner.nextLine();
        values = line.split(" ");
        for (int i = 0; i < count; i++) {
            l1.add(Integer.valueOf(values[i]));
        }
        HashSet<Integer> s1 = new HashSet<>(l1);
        if (l1.size() == s1.size()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}