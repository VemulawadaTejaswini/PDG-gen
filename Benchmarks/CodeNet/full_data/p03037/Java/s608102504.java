import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> L = new ArrayList<Integer>();
        List<Integer> R = new ArrayList<Integer>();

        for (int i = 0; i < M; i++) {
            L.add(sc.nextInt());
            R.add(sc.nextInt());
        }
        int Lmax = L.stream().mapToInt(i -> i).max().orElse(0);
        int Rmin = R.stream().mapToInt(i -> i).min().orElse(0);

        int judge = Math.abs(Rmin - Lmax + 1);
        System.out.println(judge);
        sc.close();
    }
}