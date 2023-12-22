import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        
        double aa = a / 0.08;
        double bb = b / 0.1;
        
        double aaa = Math.floor(aa / 10);
        double bbb = Math.floor(bb / 10);
        
        if(aaa == bbb){
            System.out.println((int)aa);
        } else {
            System.out.println("-1");
        }
        
        
    }
}
