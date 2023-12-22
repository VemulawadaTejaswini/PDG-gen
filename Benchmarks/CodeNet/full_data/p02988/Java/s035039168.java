import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        for (int x =1; x <= total ; x++) {
            list.add(Integer.parseInt(sc.next()));
        }
        int res = 0;
        for (int x =1; x <= total-2 ; x++) {
            int first = list.get(x-1);
            int second = list.get(x);
            int third = list.get(x+1);
            if (first<second && second<third) {
                res++;
            }
            if (second<first && third<second) {
                res++;
            }
        }
        System.out.println(res);
    }
}
