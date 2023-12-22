import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int n;
        double p;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        if(n == 1){
            p = 1;
        }else if((n % 2) == 0){
            p = 0.5;
        }else{
            p = (double) ((n - 1) / 2 + 1) / n;
        }
        
        System.out.println(p);
    }
}
