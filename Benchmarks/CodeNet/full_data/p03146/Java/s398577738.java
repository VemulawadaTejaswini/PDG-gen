import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int s = sc.nextInt();
        a.add(s);
        while (true) {
            if (s % 2 == 0) {
                s = s / 2;
                a.add(s);
            } else {
                s = 3 * s + 1;
                a.add(s);
            }
            for (int i = 1; i < a.size(); i++) {
                for (int j = i + 1; j < a.size(); j++) {
                    if (i == j) {
                        break;
                    }
                    if (a.get(i) == a.get(j)) {
                        System.out.println(j + 1);
                        return;
                    }
                }
            }
        }
    }
}