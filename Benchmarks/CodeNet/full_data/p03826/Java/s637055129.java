import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =  Integer.parseInt(sc.next());
        int b =  Integer.parseInt(sc.next());      
        int c =  Integer.parseInt(sc.next());               
        int d =  Integer.parseInt(sc.next());
        int x = a*b;
        int y = c*d;
        if(x < y)System.out.println(y);
        else if (x > y ) System.out.println(x);
        else System.out.println(x);       
    }
}