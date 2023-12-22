import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.next().split("");

        String guusuu = new String();
        String kisuu = new String();
        for(int i = 0; i < str.length; i++) {
            if(i % 2 == 0) {
                kisuu += str[i];
            } else {
                guusuu += str[i];
            }
        }

        if (guusuu.contains("R")  || kisuu.contains("L")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");

        }
    }
}
