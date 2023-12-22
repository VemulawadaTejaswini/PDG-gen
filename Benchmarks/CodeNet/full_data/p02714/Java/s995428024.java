import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, CR=0,CG=0,CB=0;
        String S;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S= sc.next();
        List<Integer> lsR = new ArrayList<>();
        List<Integer> lsG = new ArrayList<>();
        List<Integer> lsB = new ArrayList<>();
        for(int i=0; i<S.length(); i++) {
            if (S.charAt(i) == 'R') {
                CR++;
                lsR.add(i);
            }
            if (S.charAt(i) == 'G') {
                CG++;
                lsG.add(i);
            }
            if (S.charAt(i) == 'B') {
                CB++;
                lsB.add(i);
            }
        }
        int res = CR*CG*CB;
        for(int i=0; i< lsR.size(); i++){
            for(int j=0; j<lsG.size(); j++){
                for(int k=0; k<lsB.size(); k++){
                    if(lsR.get(i)+lsB.get(k)==2*lsG.get(j)||lsB.get(k)+lsG.get(j)==2*lsR.get(i)||lsG.get(j)+lsR.get(i)==2*lsB.get(k))
                        res--;
                }
            }
        }
        System.out.println(res);

    }
}
