import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
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
        List<Character> chars = IntStream.range(0, T.length()).filter(a-> a%K == mod)
                .mapToObj(ind->T.charAt(ind)).collect(Collectors.toList());
        int rock, sci, pap;
        rock=0;sci=0;pap=0;
        for(int i=0;i<chars.size();i++){
            int nr, ns, np;
            np = Math.max(rock, sci);
            nr = Math.max(sci, pap);
            ns = Math.max(rock, pap);
            switch(chars.get(i)){
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
        }
        return Math.max(rock, Math.max(sci, pap));
    }
}
