import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int a = s.length();
        boolean flag = false;
        if(a==6){
            for (int i = 2; i < a-1; i++) {
                if (s.charAt(i)==s.charAt(i+1)){
                    flag = true;
                }
            }
        }
        if (flag==false){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
