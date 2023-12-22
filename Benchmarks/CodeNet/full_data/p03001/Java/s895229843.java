import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double W = Integer.parseInt(scan.next());
        double H = Integer.parseInt(scan.next());
        double x = Integer.parseInt(scan.next());
        double y = Integer.parseInt(scan.next());
        if (W/2 == x && H/2  == y){
            System.out.println(W*H/2 + " " + 1);
        }
        else{
            System.out.println(W*H/2 + " " + 0);
        }
    }
}
