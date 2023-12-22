import java.util.*;
import java.io.*;

public class Main {
    static int sum(List<Integer> bamboos){
        int ans = 0;
        for(int x:bamboos) ans += x;
        return ans;
    }
    static int magicPoint(List<Integer> bamboos, int target){
        if(bamboos.isEmpty()) return 1000000;
        return 10 * (bamboos.size()-1) + Math.abs(sum(bamboos)-target);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] allBamboos = new int[N];
        for(int n=0; n<N; n++) allBamboos[n] = sc.nextInt();

        int ans = 1000000;

        for(int i=1; i<65536; i++){
            List<Integer> aBamboos = new ArrayList<>();
            List<Integer> bBamboos = new ArrayList<>();
            List<Integer> cBamboos = new ArrayList<>();
            for(int n=0; n<N; n++){
                switch((i>>(2*n)) & 3){
                    case 1:
                        aBamboos.add(allBamboos[n]); break;
                    case 2:
                        bBamboos.add(allBamboos[n]); break;
                    case 3:
                        cBamboos.add(allBamboos[n]); break;
                }
            }
            if(aBamboos.isEmpty() && bBamboos.isEmpty() && cBamboos.isEmpty()) break;
            int mp = magicPoint(aBamboos,A)+magicPoint(bBamboos,B)+magicPoint(cBamboos,C);
            //System.err.printf("%8s %7d %7d %7d %7d\n", Integer.toString(i, 4), mp, magicPoint(aBamboos,A), magicPoint(bBamboos,B), magicPoint(cBamboos,C));
            ans = Math.min(ans, mp);
        }
        System.out.println(ans);

    }
}