import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        Map<Integer, List<Integer>> ap = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            ap.putIfAbsent(x,new ArrayList<>());
            ap.putIfAbsent(y,new ArrayList<>());

            ap.get(x).add(y);
            ap.get(y).add(x);
        }

        boolean isTrue = true;
        Set<Integer> traversed = new HashSet<>();

        List<List<Integer>> values = new ArrayList<>(ap.values());
        for (int i = 0; i < values.size(); i++) {
            if(values.get(i).size()%2 != 0){
                isTrue = false;
            }
        }

        if(!isTrue){
            System.out.println(-1);
        }else {

            ap.entrySet()
                    .forEach(x -> {
                        int a = x.getKey();
                        List<Integer> b = x.getValue();

                        if (!traversed.contains(a)) {
                            for (int i = 0; i < b.size(); i++) {
                                System.out.println(a + " " + b.get(i));
                            }
                            traversed.addAll(b);
                        }
                    });

        }

    }
}
