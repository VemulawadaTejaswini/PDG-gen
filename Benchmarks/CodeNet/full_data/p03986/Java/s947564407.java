import java.util.Scanner;

public class Atcoder_20161001_A {

    public static void main(String[] args) {
        final String check_str = "ST";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        while(true){
            s = s.replaceFirst(check_str, "");
            if (s.indexOf(check_str, 0) == -1) break;
        }
        System.out.println(s.length());
    }
}
