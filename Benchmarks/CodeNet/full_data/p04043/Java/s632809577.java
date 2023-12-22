import java.util.ArrayList;
import java.util.Scanner;

public class Atc {

    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 7;
        boolean isOk = false;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>() {
            {
                add(sc.nextInt());
                add(sc.nextInt());
                add(sc.nextInt());
            }
        };

        if (inputs.remove(x) && inputs.size() == 2) {
            if (inputs.remove(x) && inputs.size() == 1) {
                if (inputs.remove(y) && inputs.size() == 0) {
                    isOk = true;
                }
            }
        }

        if(isOk) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
