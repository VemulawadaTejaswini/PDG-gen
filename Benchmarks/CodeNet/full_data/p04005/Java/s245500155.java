import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        int c = i.nextInt();

        int d = a * b;
        if(d % 2 != 0){
            int ab = a * b;
            int bc = b * c;
            int ca = c * a;
            int min1 = Math.min(ab, bc);
            int min2 = Math.min(min1, ca);
            System.out.println(min2);
        }else{
            System.out.println("0");
        }
    }
}