
import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.*;

 class abc {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int a = in.nextInt();
        int b = in.nextInt();

            if (1 <= a && a <= 9 && b >= 1 && b <= 9) {
                System.out.println(a * b);
                
            }
            else{
                System.out.println(-1);

            }
        }
    }




