import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String R = sc.next();

        int flgsub = 0;
        int flag = 0;
        int Rlength = R.length();

        for (int i = 0; i < T.length(); i++) {
            for (int j = 0; j < R.length(); j++) {
                if(flgsub == 1){
                    continue;
                }
                if(T.charAt(i) == R.charAt(j)) {
                    flgsub = 1;
                    R = R.substring(0,j) + R.substring(j+1,R.length());
                }
            }
            if(flgsub == 0){
                flag =1;
            }
            flgsub=0;
        }

        if(flag == 1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }
}
