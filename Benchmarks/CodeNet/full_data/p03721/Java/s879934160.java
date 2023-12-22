
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt(), K =scan.nextInt();

        List<Integer> list = new ArrayList<>();

        int tmpa = 0,tmpb =0;
        for (int i=0; i<N; i++){
            tmpa = scan.nextInt();
            tmpb = scan.nextInt();
            for (int j=0; j<tmpb; j++) list.add(tmpa);
        }

        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(K-1));
    }
}
