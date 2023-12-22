import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String v = scan.next();
        char[] S = v.toCharArray();
        List<Integer> posR = new ArrayList<>();
        List<Integer> posG = new ArrayList<>();
        List<Integer> posB = new ArrayList<>();

        for (int i = 0; i < S.length; i++) {
            if(S[i] == 'R'){
                posR.add(i);
            }else if(S[i] == 'G'){
                posG.add(i);
            }else{
                posB.add(i);
            }
        }

        long cnt = posB.size() * posG.size() * posR.size();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int k = i + (i-j);
                if(k < n && S[k] != S[i] && S[i] != S[j] && S[j] != S[k]) cnt--;
            }
        }

        System.out.println(cnt);
    }
}
