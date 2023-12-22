import java.util.*;

public class Main {

    private static class SP {
        int id;
        String S;
        int P;

        SP(int id, String S, int P) {
            this.id = id;
            this.S = S;
            this.P = P;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<SP> SPs = new ArrayList<>();
        for (int n = 0; n < N; n += 1) {
            String S = sc.next();
            int P = sc.nextInt();
            SPs.add(new SP(n + 1, S, P));
        }

        SPs.sort(new Comparator<SP>() {
            @Override
            public int compare(SP o1, SP o2) {
                int dictOrder = o1.S.compareTo(o2.S);
                if (dictOrder != 0) {
                    return dictOrder;
                } else {
                    return Integer.compare(o2.P, o1.P);
                }
            }
        });

        for (SP sp : SPs) {
            System.out.println(sp.id);
        }
    }

}
