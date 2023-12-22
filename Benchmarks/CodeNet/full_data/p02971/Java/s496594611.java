import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        Collections.sort(list2);
        Collections.reverse(list2);
        int max = list2.get(0);
        int max2 = list2.get(1);
        for(int i=0; i<n; i++) {
            if(list.get(i) == max) System.out.println(max2);
            else System.out.println(max);
        }
    }
}