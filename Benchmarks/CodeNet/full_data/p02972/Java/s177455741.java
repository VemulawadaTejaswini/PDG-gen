import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        for (int x=1; x<=n;x++) {
            int tmp = Integer.parseInt(sc.next());
            list.add(tmp);
        }
        List<Integer> resList = new ArrayList<>();
        int fin = 0;
        for (int x=n; x>=1;x--) {
            int tmp = list.get(x-1);
            int res = 0;
            for (int y=1+x; y<=n; y++) {
                if (y%x==0) {
                    res += resList.get(n-y);
                }
            }
            if (res%2==tmp) {
                resList.add(0);
            } else {
                resList.add(1);
                fin++;
            }
        }
        if (resList.size()!=n) {
            System.out.println(-1);
            return;
        }
        System.out.println(fin);
        if (fin==0) {
            return;
        }
        for (int x=n; x>=1;x--) {
            int tmp = resList.get(x-1);
            if (x==1) {
                System.out.print(tmp);
            } else {
                System.out.print(tmp+" ");
            }
        }
    }
}
