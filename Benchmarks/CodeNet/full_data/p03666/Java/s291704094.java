import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int length = 2 * (int)1e9 + 1;
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N =scan.nextInt();
        int A =scan.nextInt();
        int B =scan.nextInt();
        int C =scan.nextInt();
        int D =scan.nextInt();

        B -= A;
        B = Math.abs(B);
        N--;

        int resCount = N - (int)B / D;
        if(resCount < 0) {
            System.out.println("NO");
        }
        int res = B % D;
        int chousei = (D - C) * (N -resCount);

        int step = D-C < 2* C && 2*C<res ? 2 *C :  D-C ;
        if(resCount % 2 == 1){
            resCount--;
            res -= step;
            res = Math.abs(res);
        }
        if(resCount*step + chousei >= res) {
            System.out.println("YES");
            return;
        }


//        for (int i :IntStream.range(0, N+1).toArray()){
//            long max = (C * i + D * (N -i));
//            if(max < B) {
//                break;
//            }
//            if(max - (D -C) * i <= B) {
//                System.out.println("YES");
//                return;
//            }
//        }
        System.out.println("NO");
    }

}