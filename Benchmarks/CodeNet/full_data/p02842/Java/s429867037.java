import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double tmp = Math.floor(n / 1.08);
        double tmp2 = Math.floor(tmp * 1.08);
        if(n == tmp2){
            System.out.println((int)tmp);
        } else {
            System.out.println(":(");
        }
    }
}
