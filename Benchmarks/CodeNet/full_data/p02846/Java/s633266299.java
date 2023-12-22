import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        long a1 = in.nextLong();
        long a2 = in.nextLong();
        long b1 = in.nextLong();
        long b2 = in.nextLong();
        long v1 = t1*a1+t2*a2;
        long v2 = t1*b1+t2*b2;
        if(v1 == v2) {
            System.out.println("infinity");
            return;
        }
        if(v2 > v1) {
            long swap1 = a1;
            long swap2 = a2;
            a1 = b1;
            a2 = b2;
            b1 = swap1;
            b2 = swap2;
        }
        // 高橋くんの方が速い、という保証を作る。
        long c = 0; // 回数
        long la = 0; // 高橋くん走破距離
        long lb = 0; // 青木くん走破距離
        boolean aIsAhead = false;
        boolean toBeContinued = true;
        while(toBeContinued) {
            toBeContinued = false;

            // t1
            la += t1*a1;
            lb += t1*b1;
            if(
                    (aIsAhead && la<=lb)
                    || (!aIsAhead && la>=lb)
            ) {
                c++;
                toBeContinued = true;
            }
            aIsAhead = (la>=lb);
            if(la<0) {
                throw new RuntimeException("la : " + la);
            }
            if(lb<0) {
                throw new RuntimeException("lb : " + lb);
            }

            // t2
            la += t2*a2;
            lb += t2*b2;
            if(
                    (aIsAhead && la<=lb)
                            || (!aIsAhead && la>=lb)
            ) {
                c++;
                toBeContinued = true;
            }
            aIsAhead = (la>=lb);
            if(la<0) {
                throw new RuntimeException("la : " + la);
            }
            if(lb<0) {
                throw new RuntimeException("lb : " + lb);
            }

            long min = Math.min(la, lb);
            la -= min;
            lb -= min;
        }

        System.out.println(c);
    }
}
