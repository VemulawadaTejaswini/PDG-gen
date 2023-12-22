import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFront = true;
        String S = sc.next();
        int Q = sc.nextInt();
        for(int i = 0; i < Q; i++) {
            int q = Integer.parseInt(sc.next());
            if(q == 1) {
                isFront = !isFront;
            } else {
                int f = Integer.parseInt(sc.next());
                if(f == 1) {
                    if(isFront) S = sc.next() + S;
                    else S += sc.next();
                } else {
                    if(isFront) S += sc.next();
                    else S = sc.next() + S;
                }
            }
        }
        if(!isFront) {
            S = reverse(S);
        }
        System.out.println(S);
    }
    static String reverse(String s) {
        char[] ca = s.toCharArray();
        for(int i = 0; i < ca.length / 2; i++) {
            char t = ca[i];
            ca[i] = ca[ca.length - i - 1];
            ca[ca.length - i - 1] = t;
        }
        return String.valueOf(ca);
    }
}
