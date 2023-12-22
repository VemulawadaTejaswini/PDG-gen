import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int taxEight = in.nextInt();
        int taxTen = in.nextInt();
        double kakaku = taxEight/0.08;
        //kakaku = Math.round(kakaku);
        double b = kakaku*0.1;
        kakaku = Math.round(kakaku);
        int k = (int)kakaku;
        int j = (int)b;
        if(taxTen == j) {
            System.out.println(k);
        }else {
            System.out.println("-1");
        }
    }
}