import java.util.Scanner;
public class Main{
    
    public static void main (String[ ]args){
        
        Main main = new Main ();
        main.solve();
    }
    
    private void solve (){
        Scanner sc = new Scanner (System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (A==B){
            System.out.println(A+B);
        } else {
            if (A>B){
                System.out.println(A+A-1);
            } else {
                System.out.println(B+B-1);
            }
        }
    }
}