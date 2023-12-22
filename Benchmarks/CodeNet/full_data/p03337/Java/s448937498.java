import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        
        int plus = A + B;
        int minus = A - B;
        int kake = A * B;
        
        
        int max = Math.max(plus, minus);
        max = Math.max(max, kake);
        
        
        System.out.println(max);
        
    }
}