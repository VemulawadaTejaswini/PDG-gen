import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        for (int i = 0 ; i < n ; i++) {
            if (i % 2 == 0) {
                odd.add(sc.nextInt());
            } else {
                even.add(sc.nextInt());
            }
        }

        if (n % 2 == 1) {
            for (int i = 0 ; i < odd.size() ; i++) {
                System.out.print(odd.get(odd.size() - 1 - i));
                System.out.print(" ");
            }
            for (int i = 0 ; i < even.size(); i++) {
                System.out.print(even.get(i));
                System.out.print(" ");
            }
        } else {
            for (int i = 0 ; i < even.size() ; i++) {
                System.out.print(even.get(even.size() - 1 - i));
                System.out.print(" ");
            }
            for (int i = 0 ; i < odd.size(); i++) {
                System.out.print(odd.get(i));
                System.out.print(" ");
            }
        }

    }

}