import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> lo = new ArrayList<Integer>();
        
        for (int i = 0; i < N; i++) {
            int t = sc.nextInt();
            list.add( t);
            lo.add( t);
        }
        Collections.sort(list);
        int max = list.get(N-1);
        int smax = -1;
        boolean fl_dmax = false;
        if(list.get(N-2) == max)    fl_dmax = true;
        for(int i=list.size()-1; i>=0; i--) {
            if(list.get(i) < max) {
                smax = list.get(i);
                break;
            }
        }

        for (int i = 0; i < lo.size(); i++) {
            if( lo.get(i) != max ) {
                System.out.println(max);
            }else{
                System.out.println( fl_dmax? max: smax );
            }
        }
    }
}
