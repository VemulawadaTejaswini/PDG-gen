import java.util.*;

class Airplane {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int P = scn.nextInt();
        int Q = scn.nextInt();
        int R = scn.nextInt();
        int sum = P + Q + R;
        System.out.println(sum - Math.min(P, Math.min(Q, R)));
        scn.close();
    }
}