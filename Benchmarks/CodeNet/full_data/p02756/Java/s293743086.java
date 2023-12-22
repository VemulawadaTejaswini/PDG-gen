import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.next());
        int Q = sc.nextInt();
        boolean reverseFlg = false;
        for (int i = 0; i < Q; i++) {
            if (sc.nextInt() == 1) {
                reverseFlg = !reverseFlg;
            } else {
                if (sc.nextInt() == 1) {
                    if (reverseFlg) {
                        S.append(sc.next());
                    } else {
                        S.insert(0, sc.next());
                    }
                } else {
                    if (reverseFlg) {
                        S.insert(0, sc.next());
                    } else {
                        S.append(sc.next());
                    }
                }
            }
        }
        System.out.println(reverseFlg ? S.reverse().toString() : S.toString());
    }
}