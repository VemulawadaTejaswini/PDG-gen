import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Q = sc.nextInt();
        Long[] si = new Long[A];
        Long[] ti = new Long[B];
        Long[] xi = new Long[Q];
        for (int i=0; i<A; i++) {
            si[i] = sc.nextLong();
        }
        for (int i=0; i<B; i++) {
            ti[i] = sc.nextLong();
        }
        for (int i=0; i<Q; i++) {
            xi[i] = sc.nextLong();
        }
        for (int i=0; i<Q; i++) {
            Long x = xi[i];
            Long dtmin = 9999999999L;
            Long lastposition = 0L;
            boolean jinjaFlg  = true;
            for (int j=0; j<A; j++) {
                Long s = si[j];
                Long dt = Math.abs(x - s);
                if (dtmin > dt) {
                    dtmin = dt;
                    lastposition = s;
                }
            }
            for (int j=0; j<B; j++) {
                Long t = ti[j];
                Long dt = Math.abs(x - t);
                if (dtmin > dt) {
                    dtmin = dt;
                    lastposition = t;
                    jinjaFlg = false;
                }
            }
            Long dtmin2 = 9999999999L;
            if (!jinjaFlg) {
                for (int j=0; j<A; j++) {
                    Long s = si[j];
                    Long dt = Math.abs(lastposition - s);
                    if (dtmin2 > dt) {
                        dtmin2 = dt;
                    }
                }
            }
            else {
                for (int j=0; j<B; j++) {
                    Long t = ti[j];
                    Long dt = Math.abs(lastposition - t);
                    if (dtmin2 > dt) {
                        dtmin2 = dt;

                    }
                }
            }
            System.out.println(dtmin + dtmin2);
        }

    }
}