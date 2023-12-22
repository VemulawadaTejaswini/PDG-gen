import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int a1 = Integer.parseInt(sc.next());
        int a2;
        for(int i = 1; i < n; i++){
            a2 = Integer.parseInt(sc.next());
            a1 = gcd(a1, a2);
        }
        
        System.out.println(a1);
    }
    
    private static int gcd(int a, int b){
        
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}