import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                int n = Integer.parseInt(sc.nextLine());
                String[] x_strs = sc.nextLine().split(" ");
                ArrayList<Integer> xs = new ArrayList<Integer>();
                ArrayList<Integer> ys = new ArrayList<Integer>();
                for(int i = 0; i < n; i++){
                    xs.add( Integer.parseInt(x_strs[i]) ); 
                    ys.add( Integer.parseInt(x_strs[i]) ); 
                }
                Collections.sort(ys);
                int m1 = ys.get(n / 2 - 1);
                int m2 = ys.get(n / 2 );
                for(int i = 0; i < n; i++){
                    if(xs.get(i) <= m1) System.out.println(m2);
                    else System.out.println(m1);
                }
            }
        }
    }
}