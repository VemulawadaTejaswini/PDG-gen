import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 7;
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<Integer>() {
            {
                add(sc.nextInt());
                add(sc.nextInt());
                add(sc.nextInt());
            }
        };

        if (inputs.remove(x) && inputs.size() == 2) {
            if (inputs.remove(x) && inputs.size() == 1) {
                if (inputs.remove(y) && inputs.size() == 0) {
                    b = true;
                }
            }
        }

        if(b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
