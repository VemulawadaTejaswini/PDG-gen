import javafx.collections.transformation.SortedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String a = scanner.next();
            String b = scanner.next();
            Set<String> l = new TreeSet<>();
            l.add(a.repeat(Integer.parseInt(b)));
            l.add(b.repeat(Integer.parseInt(a)));
            System.out.println(l.toArray()[0]);
        }
    }

}
