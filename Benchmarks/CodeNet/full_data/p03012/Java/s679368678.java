import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int w[] = new int[n];
        for(int i=0; i<n; i++){
          w[i] = sc.nextInt();
          sum += w[i];
        }
        Arrays.sort(w);
        int all = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
          all += w[i];
          min = min(min, abs(sum-all));
        }
        System.out.println(min);
    }
}
