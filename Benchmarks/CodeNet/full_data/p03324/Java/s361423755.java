import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        long ans = 0;
        
        if(D == 0){
            ans = N;
        }
        else if(D == 1){
            ans = N*100;
        }
        else{
            ans = N*10000;
        }
        
        System.out.println(ans);
    }
}
