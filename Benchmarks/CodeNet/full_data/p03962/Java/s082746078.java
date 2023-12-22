import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), res=0;
        if (a==b && a==c) {
            res=1;
        } else if (a==b || a==c) {
            res=2;
        } else {
            res=3;
        }
        System.out.println(res);
    }
}
