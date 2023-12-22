import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int happiness = (x/500)*1000;
        x %= 500;
        happiness += (x/5)*5;
        
        System.out.println(happiness);
    }
}
