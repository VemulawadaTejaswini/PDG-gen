import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String whiteLine = "";
        List<String> BW = new ArrayList<>();
        for (int i = 0; i < W; i++) {
            whiteLine += ".";
        }
        for (int i = 0; i < H; i++) {
            String S = sc.next();
            if (!S.equals(whiteLine)) {
                BW.add(S);
            }
        }
        boolean[] lostOrder = new boolean[W];
        for (int i = 0; i < W; i++) {
            boolean orderJudge = true;
            for (int j = 0; j < BW.size(); j++) {
                if (BW.get(j).charAt(i) == '#') {
                    orderJudge = false;
                }
            }
            if (orderJudge) {
                lostOrder[i] = true;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < BW.size(); i++) {
            for (int j = 0; j < W; j++) {
                if (!lostOrder[j]) {
                    ans.append(BW.get(i).charAt(j));
                }
            }
            ans.append("\n");
        }
        System.out.println(ans);
    }
}