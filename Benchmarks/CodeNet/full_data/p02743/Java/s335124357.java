import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if(4*a*b<(c-a-b)*(c-a-b) && a<c&&b<c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
 
}