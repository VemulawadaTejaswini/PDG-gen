import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(sc.nextInt());
        intList.add(sc.nextInt());
        intList.add(sc.nextInt());

        Collections.sort(intList);

        System.out.println(intList.get(0) + intList.get(1) + intList.get(2) * 10);
        sc.close();
    }
}
