import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.next());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            arrayList.add(Integer.parseInt(sc.next()));
        }
        arrayList.sort(Collections.reverseOrder());
        int alice = 0, bob = 0;
        for (int i = 0; i < number; i++) {
            int max = arrayList.remove(0);
            if (i % 2 == 0) {
                alice += max;
            } else {
                bob += max;
            }
        }
        System.out.println(alice - bob);
    }
}