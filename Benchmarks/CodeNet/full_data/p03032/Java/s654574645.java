
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        int[] v = new int[n];
        for(int i=0;i<n;i++){
            v[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int max = 0;
        int A,B;
        int count = Math.min(n,k);
        List<Integer> jewel = new ArrayList<Integer>();
        int sum = 0;
        for(A=0;A<=count;A++){
            for(B=0;A+B<=count;B++){
                sum = 0;
                jewel.clear();
                for(int i=0;i<A;i++){
                    sum+=v[i];
                    jewel.add(v[i]);
                }
                for(int i=n-B;i<n;i++){
                    sum+=v[i];
                    jewel.add(v[i]);
                }
                Collections.sort(jewel);
                int idx = 0;
                while(idx < jewel.size() && idx<k-A-B && jewel.get(idx)<0 ){
                    sum-=jewel.get(idx++);
                }
                max = Math.max(sum,max);
            }
        }
        System.out.println(max);

    }
}