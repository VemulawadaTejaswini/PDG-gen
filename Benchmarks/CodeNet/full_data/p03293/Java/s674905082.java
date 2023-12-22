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

        for (int i = 0; i < T.length(); i++) {
            T = T.substring(1,T.length()) + T.substring(0,1);
            if(T.equals(R)){
                flag =1;
            }
        }
        if(flag == 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }
}
