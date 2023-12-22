import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0;
        
        int t =0;
        for(int i=1;i<=999;i++){
            t += i;
            if(t>a){
                break;
            }
        }
        
        x = t - a;
        
        System.out.println(x);
    }
}
