import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // key  :i君が教室に入ったときに何人いたか
        // value:i
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        int N = sc.nextInt();
        for(int i=1; i<=N;i++) {
            map.put(sc.nextInt(), i);
        }

        Integer[] junban = map.values().toArray(new Integer[0]);
        
        StringBuilder result = new StringBuilder("");
        
        result.append(junban[0]);
        
        for(int jun = 1; jun<N; jun++) {
            result.append(" ");
            result.append(junban[jun]);
        }

        System.out.println(result.toString());       
    }

}
