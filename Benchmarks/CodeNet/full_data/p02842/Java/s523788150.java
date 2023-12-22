import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int r = (int)n - (int)Math.floor(n / 108 * 8);
        if(n == Math.floor(r * 1.08)){
            System.out.println(r);
        }else{
            System.out.println(":(");
        }
    }
}