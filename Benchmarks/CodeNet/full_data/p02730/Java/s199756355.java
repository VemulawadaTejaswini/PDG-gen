import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        int a = s.length()-1;
        int b = (a-1)/2;
        int c = (a+3)/2;
        boolean flag = false;
        for (int i = 0; i < a; i++) {
            if(s.charAt(i)==s.charAt(a)){
                if (s.charAt(i)==s.charAt(b)){
                    if(s.charAt(c)==s.charAt(a)){
                        flag = true;
                    }
                }
            }
            a--;
            b--;
            c++;
        }
        if (flag==false){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }

    }
}
