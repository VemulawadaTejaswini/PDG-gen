import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        if(list.get(0) + list.get(1) == list.get(2)) System.out.println("Yes");
        else System.out.println("No");
    }
}