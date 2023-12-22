//agc033_b
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt(), N = sc.nextInt();
        int Sr = sc.nextInt(), Sc = sc.nextInt();
        String S = sc.next(), T = sc.next();
        sc.close();

        HashMap<String, Integer> T_Kun = new HashMap<>(),
                                 A_Kun = new HashMap<>();
        for (int n = 0; n < 4; n++) {
            String ch = String.valueOf("LRUD".charAt(n)); 
            T_Kun.put(ch, 0);
            A_Kun.put(ch, 0);
        }
        for (int n = 0; n < N; n++) {
            int t = T_Kun.get(String.valueOf(S.charAt(n)));
            T_Kun.put(String.valueOf(S.charAt(n)), ++t);
            int a = A_Kun.get(String.valueOf(T.charAt(n)));
            A_Kun.put(String.valueOf(T.charAt(n)), ++a);
        }
    int  Dl = Sc - T_Kun.get("L") + A_Kun.get("R");
int  Dr = Sc - T_Kun.get("R") + A_Kun.get("L");
int  Du = Sr - T_Kun.get("U") + A_Kun.get("D");
int  Dd = Sr - T_Kun.get("D") + A_Kun.get("U");
        boolean ans = true;
if (Dl < 0) ans=false;
else if (Dr > W) ans=false;
else if (Du < 0) ans=false;
else if (Dd > H) ans=false;
        System.out.println(!ans ? "YES": "NO");
    }
}