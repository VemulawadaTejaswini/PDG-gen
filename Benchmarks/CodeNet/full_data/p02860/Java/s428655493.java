
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());
        String[] s = scanner.next().split("");

        int half =  x / 2;
        for(int i = 0; i < half; i++) {
            if(!(s[i].equals(s[half+i]))) {
                 System.out.println("No");
                 break;
            }
            if (i >= half - 1) System.out.println("Yes");
        }
    }
}