import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n%10;
        int b = n/10%10;
        int c = n/100%10;
        if(a==7 || b==7||c==7) {
            p("Yes");
        }else {
            p("No");
        }
    }

    public static <T> void p(T message) {
        System.out.println(message);
    }

    public static <T> void pp(T message) {
        System.out.print(message);
    }
}