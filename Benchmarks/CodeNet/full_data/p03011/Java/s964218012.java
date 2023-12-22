import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        int tmp=0;

        ArrayList<Integer> list = new ArrayList<>();

        list.add(P);
        list.add(Q);
        list.add(R);

        Collections.sort(list);

        int one = list.get(0);
        int two = list.get(1);

        System .out.println(one+two);

    }
}