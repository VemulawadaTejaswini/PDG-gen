import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner itr = new Scanner(System.in);
        //long N = (long) itr.nextInt();
        //long A = (long) itr.nextInt();
        //long B = (long) itr.nextInt();

        int N = itr.nextInt();
        int A = itr.nextInt();
        int B = itr.nextInt();

        int time = N / (A + B) * A;
        int res = N % (A + B);
        res = Math.min(res, A);
        res += time;

        System.out.println(res);
    }


}