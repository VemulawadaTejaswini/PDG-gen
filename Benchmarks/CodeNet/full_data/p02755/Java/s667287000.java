import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long a = stdIn.nextLong();
        long b = stdIn.nextLong();

        long l1 = 25 * a / 2;
        long r1 = 25 * (a + 1) / 2;
        long l2 = 10 * b / 1;
        long r2 = 10 * (b + 1) / 1;

        System.out.println(l1 + ", " + r1 + ", " + l2 + ", " + r2);

        if(r1 < l2 || r2 < l1){
            System.out.println(-1);
        }else{
            System.out.println((l1 < l2) ? l2 : l1);
        }
    }
}