import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int p1 = x2 - x1;
        int p2 = y2 - y1;
        int q1 = -p2;
        int q2 = p1;
        System.out.print(x2 + q1);
        System.out.print(" ");
        System.out.print(y2 + q2);
        System.out.print(" ");
        System.out.print(x2 + q1 - p1);
        System.out.print(" ");
        System.out.print(y2 + q2 - p2);
    }
}