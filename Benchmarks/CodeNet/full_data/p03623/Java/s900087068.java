import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int d1 = Math.abs(x-a);
        int d2 = Math.abs(x-b);

        if(d1 < d2){
            System.out.println("A");
        } else
            System.out.println("B");
    }
}