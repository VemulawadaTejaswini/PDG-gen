import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int K = Integer.parseInt(sc.next());
        final int R = Integer.parseInt(sc.next());
        final int S = Integer.parseInt(sc.next());
        final int P = Integer.parseInt(sc.next());
        final char T[] = sc.next().toCharArray();
        sc.close();

        List<Character> C = new ArrayList<>();
        Func1 func1 = new Func1() {
            @Override
            public char print(char c) {
                if (c=='r')
                    return 'p';
                else if (c=='s')
                    return 'r';
                else
                    return 's';
            }
        };
        Func2 func2 = new Func2() {
            @Override
            public int print(char c) {
                if (c=='r') {
                    return R;
                } else if (c=='s') {
                    return S;
                } else if (c=='p') {
                    return P;
                } else {
                    return 0;
                }
            }
        };
        for (char t : T) {
            C.add(func1.print(t));
        }
        for (int i=0; i<N-K; i++) {
            if (C.get(i)==C.get(i+K)) {
                C.set(i+K,'x');
            }
        }
        long sum = 0;
        for (char c : C) {
            sum += func2.print(c);
        }
        
        System.out.println(sum);
    }
    public interface Func1 {
        char print(char c);
    }
    public interface Func2 {
        int print(char c);
    }
}