import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final long MODVAL = 1000000007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> ls = new ArrayList<>();
        ls.add("a");
        for(int i=1; i<N; i++) {
            List<String> tmp = new ArrayList<>();
            for(String before : ls) {
                for(int t=0; t<i+1; t++) {
                    String ts = before + "abcdefghijkl".substring(t, t+1);
                    tmp.add(ts);
                }
            }
            ls = tmp;
        }
        for(String tmp : ls) {
            System.out.println(tmp);
        }
    }
}
