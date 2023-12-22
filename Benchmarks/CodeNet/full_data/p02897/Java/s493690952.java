import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double result = 0.0;
        if(num%2 == 0) {
            result = 1.0/2.0;
            System.out.println(result);
        }else if(num == 1) {
            System.out.println(1.0);
        } else {
            result = ((num-1)/2+1)/(double)num;
            System.out.println(result);
        }
    }

}
