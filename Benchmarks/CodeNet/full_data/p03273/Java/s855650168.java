import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        Set<Integer> removedH = new HashSet<>();
        Set<Integer> removedW = new HashSet<>();
        String a[] = new String[h];
        for (int i=0; i<h; i++) {
            a[i] = sc.next();
            if (!a[i].contains("#")) {
                removedH.add(i);
            }
        }

        for (int j=0; j<w; j++) {
            boolean blackPresent = false;
            for (int i=0; i<h; i++) {
                if (a[i].charAt(j) == '#') {
                    blackPresent = true;
                    break;
                }
            }
            if (!blackPresent) removedW.add(j);
        }

        for (int i=0; i<h; i++) {
            if (removedH.contains(i)) continue;
            for (int j=0; j<w; j++) {
                if (removedW.contains(j)) continue;
                System.out.print(a[i].charAt(j));                
            }
            System.out.println();
        }
    }
}
