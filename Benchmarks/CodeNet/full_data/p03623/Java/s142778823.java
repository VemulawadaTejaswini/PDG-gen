import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println(Math.abs(x-a)<Math.abs(x-b)?'A':'B');
    }
}
