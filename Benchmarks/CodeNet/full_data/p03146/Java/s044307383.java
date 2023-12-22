import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(s);
        while(true) {
            if(s % 2 == 0) s = s / 2;
            else s = s * 3 + 1;
            if(list.contains(s)) {
                System.out.println(list.size() + 1);
                return;
            } else {
                list.add(s);
            }
        }
    }
}
