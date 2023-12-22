import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(a+b);
        list.add(a-b);
        list.add(a*b);
        Collections.sort(list);
        System.out.println(list.get(2));
    }
}