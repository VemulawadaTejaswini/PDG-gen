

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x >= 1 && x <= 9) {
            System.out.println(x * x * x);
        }
    }
}
