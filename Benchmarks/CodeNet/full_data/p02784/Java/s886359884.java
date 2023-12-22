import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        int res = 0;
        for(int i=0;i<N;i++){
            res += Integer.parseInt(sc.next());
        }
        String str = res >= H ? "Yes" : "No";
        System.out.println(str);
    }
}
