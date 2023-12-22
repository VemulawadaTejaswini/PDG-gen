
import java.util.*;

import static java.lang.CharSequence.compare;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        List<Character> listA = new ArrayList<>();
        List<Character> listB = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            listA.add(a.charAt(i));
        }

        for (int i = 0; i < b.length(); i++) {
            listB.add(b.charAt(i));
        }

        Collections.sort(listA);
        Collections.sort(listB, Collections.reverseOrder());

        StringBuilder aSorted = new StringBuilder();
        StringBuilder bSorted = new StringBuilder();

        for (Character c : listA) {
            aSorted.append(c);
        }

        for (Character c : listB) {
            bSorted.append(c);
        }

        System.out.println(compare(aSorted, bSorted) < 0 ? "Yes" : "No");

    }
}