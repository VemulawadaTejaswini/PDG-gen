import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        String sss;
        int dif;
        int min = 1000000;

        for(int i = 0; i<  S.length()-2;i++){

            sss = S.substring(i, i+3);
            dif = 753 - Integer.parseInt(sss);
            if(dif < 0) dif = -dif;
            if(dif < min) min = dif;
        }

        System.out.println(min);

    }
}