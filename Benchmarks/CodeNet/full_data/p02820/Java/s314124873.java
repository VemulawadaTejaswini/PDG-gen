import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String T = sc.next();
        int res = IntStream.range(0, K).map(
            mod->maxValue(mod, T, R, S, P, K)
        ).sum();
        System.out.println(res);
    }

    public static int maxValue(int mod, String T, int R, int S, int P, int K){
        int rock, sci, pap;
        rock=0;sci=0;pap=0;

        int ind=mod;
        while(ind < T.length()){
            int nr, ns, np;
            np = Math.max(rock, sci);
            nr = Math.max(sci, pap);
            ns = Math.max(rock, pap);
            switch(T.charAt(ind)){
                case 'r':
                    np += P;
                    break;
                case 's':
                    nr += R;
                    break;
                case 'p':
                    ns += S;
                    break;
            }
            rock = nr;sci = ns;pap = np;
            ind += K;
        }
        return Math.max(rock, Math.max(sci, pap));
    }
}
