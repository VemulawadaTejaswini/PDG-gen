import java.awt.*;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.List;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = nextInt();
        int M = nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<M; i++){
            List<Integer> list = new ArrayList<>();
            int a = nextInt()-1;
            int b = nextInt()-1;
            if(map.containsKey(b)){
                list = new ArrayList<>(map.get(b));
            }
            list.add(a);
            map.put(b, list);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        int x = 0;
        int count = 1;
        for(int i=0; i<keys.size(); i++){
            if(i == 0) x = keys.get(i)-1;
            for(int j=0; j<map.get(keys.get(i)).size(); j++){
                int key = keys.get(i);
                int num = map.get(key).get(j);
                if(x < num){
                    count++;
                    x = keys.get(i)-1;
                    break;
                }
            }
        }

        println(count);
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static Long nextLong() {
        return Long.parseLong(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }

    static void print(Object o) {
        PrintWriter out = new PrintWriter(System.out);
        out.print(o);
        out.flush();
    }
}
