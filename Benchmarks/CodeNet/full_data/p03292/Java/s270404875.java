import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//        int a = 11;
//        int b = 5;
//        int c = 5;
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        int res = 0;
        int cost1 = Math.abs(b-a)+Math.abs(c-b);
        res = cost1;
        int cost2 = Math.abs(c-a)+Math.abs(b-c);
        if (cost2<res) res =cost2;
        int cost3 = Math.abs(c-b)+Math.abs(a-c);
        if (cost3<res) res = cost3;
        int cost4 = Math.abs(a-b)+Math.abs(c-a);
        if (cost4<res) res = cost4;
        int cost5 = Math.abs(a-c)+Math.abs(b-a);
        if (cost5<res) res = cost5;
        int cost6 = Math.abs(b-c)+Math.abs(a-b);
        if (cost6<res) res = cost6;

        System.out.println(res);

    }

}