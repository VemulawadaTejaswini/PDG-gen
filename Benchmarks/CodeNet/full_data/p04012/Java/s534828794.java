import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        ArrayList<Character> tmp = new ArrayList<>();
        loop: for (int i = 0; i < w.length(); i++) {
            int count = 1;
            char set = w.charAt(i);
            for (int k = 0; k < tmp.size(); k++) {
                if (tmp.get(k) == set) {
                    continue loop;
                }
            }
            for (int j = i + 1; j < w.length(); j++) {
                if (set == w.charAt(j)) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println("No");
                return;
            }
            tmp.add(set);
        }
        System.out.println("Yes");
    }
}