import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long a = Integer.parseInt(sc.next());
        long b = Integer.parseInt(sc.next());
        long c = Integer.parseInt(sc.next());
        
        long x = a*b*4;
        long y = (c-a-b)*(c-a-b);
        
        System.out.println((x<y)?"Yes":"No");
    }
}
