import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    List<String> D = new ArrayList<>();
    for (int i = 0;i < K ;i++) {
        D.add(Integer.toString(sc.nextInt()));
    }
    boolean key = true;
    int ans = 0;
    for (int i = 0; key ;i++) {
        ans = N+i;
        key = cycle(ans,D);
    }
    System.out.println(ans);
    }

    public static boolean cycle(int N, List<String> D) {
        List<String> st = new ArrayList<>();
        for (String n:Integer.toString(N).split("")) {
            st.add(n);
        }
        for (String d : D) {
            if (!st.contains(d)) {
                continue;
            } else {
                return true;
            }
        }
        return false;
    }
}