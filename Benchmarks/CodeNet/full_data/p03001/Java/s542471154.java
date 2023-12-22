import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        double ans = W*H/2;
        
        if(W/2==x && H/2==y){
            System.out.println(ans+" "+1);
        }else{
            System.out.println(ans+" "+0);
        }
    }
}