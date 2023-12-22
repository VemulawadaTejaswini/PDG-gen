import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        int P = yomi.nextInt();
        int Q = yomi.nextInt();
        int R = yomi.nextInt();
        if (P > Q && P > R){
            System.out.println(Q+R);
        }else if (Q > P && Q > R){
            System.out.println(P+R);
        }else System.out.println(P+Q);

    }
}