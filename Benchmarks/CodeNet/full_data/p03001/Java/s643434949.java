
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);        
        double w = stdIn.nextDouble();
        double h = stdIn.nextDouble();
        double x = stdIn.nextDouble();
        double y = stdIn.nextDouble();
        if(w > h){
            System.out.printf("%6f ",w * h * Math.min(x/w,(w - x)/w));
        }else{
            System.out.printf("%6f ",w * h * Math.min(y/h, (h - y)/h));
        }
            System.out.println((w-x)/x == (h - y)/y ? "1" : "0");

    }
}