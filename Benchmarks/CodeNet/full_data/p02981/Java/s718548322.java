import java.util.Scanner;

class Main {
    
    public static void main (String[] args){
        
        Main main = new Main ();
        
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if(N*A>B){
            System.out.println(B);
        } else {
            System.out.println(A);
        }
    }
}