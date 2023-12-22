import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if((w == x || x == 0) && (h == y || y == 0)){
            System.out.print((w*h/2) + " " + 1);
        }else{
            double FixedX1 = (w * y) != 0 ? w * y : Double.MAX_VALUE;  
            double FixedX2 = (w * (h-y)) != 0 ? w * (h-y) : Double.MAX_VALUE;  
            double FixedY1 = (x * h) != 0 ? x * h : Double.MAX_VALUE;  
            double FixedY2 = ((w-x) * h) != 0 ? (w-x) * h : Double.MAX_VALUE;
            double FixedX = Math.min(FixedX1,FixedX2);
            double FixedY = Math.min(FixedY1,FixedY2);
            System.out.print(Math.max(FixedX,FixedY) + " " + ((FixedX == FixedY) ? 1 : 0));
        }
    }
}