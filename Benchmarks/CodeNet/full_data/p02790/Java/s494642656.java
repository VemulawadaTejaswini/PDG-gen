
import static java.lang.Math.pow;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a >= 1 && a <= 9 && b >= 1 && b <= 9) {
           for(int i=0;i<a;i++){
               System.out.print(b);
           }
        }
    }
}
