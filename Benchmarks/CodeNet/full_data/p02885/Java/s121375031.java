import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a,b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(b >= (a / 2)){
            System.out.println(0);
        }else{
            System.out.println(a - (b * 2));
        }
        
    }
}