import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        int index = n / 2 -1;
        ArrayList<Long> list2 = (ArrayList<Long>) list.clone();
        Collections.sort(list2);
        for (int i = 0; i < n; i++) {
            ArrayList<Long> list3 = (ArrayList<Long>) list2.clone();
            list3.remove(list.get(i));
            System.out.println(list3.get(index));
        }
    }
}