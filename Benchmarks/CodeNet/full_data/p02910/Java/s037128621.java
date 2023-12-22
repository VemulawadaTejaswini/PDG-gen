
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();

        int i = 1;
        for (String str : sc.next().split("")) {
            if (i % 2 > 0) {
                a.add(str);
            } else {
                b.add(str);
            }
            i++;
        }

        if (((a.contains("R") && !a.contains("L")) && (b.contains("L") && !b.contains("R")))) {
            System.out.println("Yes");
        } else if ((a.contains("U") || a.contains("D")) || b.contains("U") || b.contains("D")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}