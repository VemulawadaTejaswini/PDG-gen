import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        int d = sc.nextInt();
        sc.close();

        double sum = 0;
        if(d != 0){
            sum += Math.max(0, 2*(n-2*d));
            sum += 2*d;
        } else {
            sum += n;
        }
        System.out.println(sum/n/n*(m-1));
    }
}