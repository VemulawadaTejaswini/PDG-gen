import java.util.*;
public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int K = sc.nextInt();
        int amari = 0;
        
        amari = Num % K;
        
        System.out.println(amari);
        
    }
    
}
