
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int w=Integer.parseInt(s1[0]);
        int h=Integer.parseInt(s1[1]);
        int x=Integer.parseInt(s1[2]);
        int y=Integer.parseInt(s1[3]);

        BigDecimal bd = new BigDecimal(w*h/2);
        BigDecimal menseki=bd.setScale(6, BigDecimal.ROUND_DOWN);
        int judge=0;
        if (x==w/2 && y==h/2) {
        	judge=1;
        }

        System.out.println(menseki + " " + judge);
    }
}