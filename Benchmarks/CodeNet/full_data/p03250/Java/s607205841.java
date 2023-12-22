import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b < a && c < a) a *= 10;
        else if(a <= b && c < b) b *= 10;
        else c *= 10;
        System.out.println(a + b + c);
        sc.close();

    }

}
