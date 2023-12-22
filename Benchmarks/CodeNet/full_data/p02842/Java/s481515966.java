import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        
        double ans = N/1.08;
        
        if(ans%1==0){
            System.out.println((int)ans);
        }else{
            System.out.println(":(");
        }
        
    }
}
