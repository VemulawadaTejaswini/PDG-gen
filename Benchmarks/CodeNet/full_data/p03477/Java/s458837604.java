import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if((a+b)>(c+d)) {
            System.out.println("Left");
        }
        else if((a+b)<(c+d)) {
            System.out.println("Right");
        }
        else {
            System.out.println("Balanced");
        }
    }
}