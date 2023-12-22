import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long X = sc.nextLong();
        ArrayList<Long> x = new ArrayList<>(); 
        ArrayList<Long> diff = new ArrayList<>(); 

        for (int i = 0; i<N; i++) {
            x.add(sc.nextLong());
        }
        x.add(X);

        Collections.sort(x);

        for (int i = 0; i<x.size()-1; i++) {
            diff.add(x.get(i+1) - x.get(i));
        }

        Long result = diff.get(0);
        for (int i = 1; i<diff.size(); i++) {
            result = calcBGF(result, diff.get(i));
        }

        System.out.println(result);
    }

    static Long calcBGF(Long x, Long y) {
        if (x > y) {
            return calcBGF(y, x);
        }

        if (x == 0) {
            return y;
        }

        return calcBGF(x, y - x);
    }
}