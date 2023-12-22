import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> S = new LinkedList<>();
        S.add(sc.next());
        int Q = sc.nextInt();
        boolean reverseFlg = false;
        for (int i = 0; i < Q; i++) {
            if (sc.nextInt() == 1) {
                reverseFlg = !reverseFlg;
            } else {
                if (sc.nextInt() == 1) {
                    if (reverseFlg) {
                        S.add(sc.next());
                    } else {
                        S.add(0, sc.next());
                    }
                } else {
                    if (reverseFlg) {
                        S.add(0, sc.next());
                    } else {
                        S.add(sc.next());
                    }
                }
            }
        }
        if (reverseFlg) {Collections.reverse(S);}
        S.forEach(System.out::print);
        System.out.println();
    }
}