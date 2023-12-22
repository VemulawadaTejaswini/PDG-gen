import java.io.*;
import java.util.*;

public class Main{
    static public void main(String[] args) throws Exception{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ")
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    int solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] WARec = new int[n];
        boolean[] hasAc = new boolean[n];
        for(int i=0;i<m;i++){
            int p = sc.nextInt()-1;
            String res = sc.next();
            if(res.equals("AC")){
                hasAc[p] = true;
            } else{
                if(hasAc[p]) continue;
                WARec[p] += 1;
            }
        }
        int acNum = 0, penalty = 0;
        for(int i=0;i<n;i++) {
            acNum += hasAc[i] ? 1 : 0;
            penalty += hasAc[i]? WARec[i]:0;
        }
        System.out.println(acNum+" "+penalty);
        return 0;
    }
}

