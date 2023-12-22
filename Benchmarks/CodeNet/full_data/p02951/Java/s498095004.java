import java.util.*;

class Main {

    static int solve(int a, int b, int c) {
        int re =  c - (a-b);
        return re>0?re:0;
    }

    public static void main(String[] as) {
        Scanner stdIn=new Scanner(System.in);
        int a=stdIn.nextInt();
        int b=stdIn.nextInt();
        int c=stdIn.nextInt();

        System.out.println(solve(a,b,c));
    }

}


