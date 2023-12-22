import java.util.*;
import java.lang.*;

class Main {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();
        String strC = sc.next();


        // 判定
        boolean isShiritori = (strA.substring( strA.length() )).equals(strB.substring(0,1)) && 
                              (strB.substring( strB.length() )).equals(strC.substring(0,1));

        if (isShiritori) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


