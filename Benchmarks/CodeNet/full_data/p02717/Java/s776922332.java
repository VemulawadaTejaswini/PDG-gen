import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(Integer.parseInt(sc.next()));
        }
        System.out.println(list.get(2));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        sc.close();
    }

}
