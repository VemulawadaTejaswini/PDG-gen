import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int K = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(14);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(15);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(51);


        System.out.println(list.get(K));

    }
}