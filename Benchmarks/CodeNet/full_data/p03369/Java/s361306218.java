import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        S = S.replace("x", "");
        System.out.println(700+100*S.length());
    }
}