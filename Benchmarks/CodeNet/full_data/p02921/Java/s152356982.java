import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        char s1[] = inp.next().toCharArray();
        char s2[] = inp.next().toCharArray();
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (s1[i] == s2[i]) ans++;
        }
        System.out.println(ans);
    }
}
