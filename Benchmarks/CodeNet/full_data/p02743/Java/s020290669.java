import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long a;
        a = sc.nextLong();
        long b;
        b = sc.nextLong();
        long c;
        c = sc.nextLong();
        
        double d = StrictMath.sqrt(a) + StrictMath.sqrt(b);
        //System.out.println(d);
        
        double e = StrictMath.sqrt(c);
        //System.out.println(e);
        
        if(d<e){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    
}