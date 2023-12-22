import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        double a = sn.nextInt();
        double b = sn.nextInt();
        double c = sn.nextInt();

        double right = Math.sqrt(a) + Math.sqrt(b);
        double left = Math.sqrt(c);
        if(right < left){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}