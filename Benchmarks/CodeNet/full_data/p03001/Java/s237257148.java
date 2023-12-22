import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer W = Integer.parseInt(scan.next());
        Integer H = Integer.parseInt(scan.next());
        Integer X = Integer.parseInt(scan.next());
        Integer Y = Integer.parseInt(scan.next());

        double s1 = W * Y;
        double s2 = (W-X) * H;

        System.out.println(s1 + "  " + s2);

        if(s1 > s2){
            double tmp = s1;
            s1 = s2;
            s2 = tmp;
        }

        int c = 1;
        if(s1 != s2) c = 0;

        System.out.println(s1 + " " + c);
    }
}