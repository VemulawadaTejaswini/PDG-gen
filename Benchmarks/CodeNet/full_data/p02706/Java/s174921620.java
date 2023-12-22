import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        int n = yomi.nextInt();
        int m = yomi.nextInt();
        int a = 0;
        for (int i =0;i<m;i++){
            a += yomi.nextInt();
        }
        System.out.println(n-a>=0 ? n-a : -1);

    }
}