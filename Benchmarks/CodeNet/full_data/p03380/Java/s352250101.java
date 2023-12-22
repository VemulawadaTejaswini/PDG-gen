import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                int n = Integer.parseInt(sc.nextLine());
                String[] x_strs = sc.nextLine().split(" ");
                ArrayList<Integer> xs = new ArrayList<Integer>();
                for(int i = 0; i < n; i++){
                    xs.add( Integer.parseInt(x_strs[i]) ); 
                }
                Collections.sort(xs);
                int last = xs.get(n - 1);
                //最もlast/2に近いもの探索
                int nearest_index = 0;
                double nearest_diff = last;
                for(int i = 0; i < n; i++){
                    if(last/2.0 - xs.get(i) < nearest_diff && xs.get(i) - last/2.0 < nearest_diff){
                        nearest_diff = last/2.0 - xs.get(i);
                        nearest_index = i;
                    }
                }
                System.out.println(last + " " + xs.get(nearest_index));
            }
        }
    }
}