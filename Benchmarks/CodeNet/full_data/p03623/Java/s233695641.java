import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        int suri = scan.nextInt();
        int miseA = scan.nextInt();
        int miseB = scan.nextInt();
        
        int x1,x2,x3;
        
        x1 = suri;
        x2 = miseA;
        x3 = miseB;
        
        int ans1 = miseA - suri;
        int ans2 = miseB - suri;
        
        if (ans1 < 0){
            ans1 = ans1 * -1;
        }else if (ans2 < 0){
            ans2 = ans2 * -1;
        }
        
        if (ans1 > ans2){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
        
    }
}