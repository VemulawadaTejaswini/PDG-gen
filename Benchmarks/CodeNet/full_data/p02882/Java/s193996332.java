import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double x = Double.parseDouble(sc.next());
        
        if(x < a*a*b/2){
            double c = (2*x)/(a*b);
            double d = b/c;
            System.out.println(Math.toDegrees(Math.atan(d)));
        }else{
            double c = (2*(a*a*b - x))/(a*a);
            double d = c/a;
            System.out.println(Math.toDegrees(Math.atan(d)));
        }
    }
}