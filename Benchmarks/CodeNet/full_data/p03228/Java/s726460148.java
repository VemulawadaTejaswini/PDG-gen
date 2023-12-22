import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Main main = new Main();
        main.solve();
    }
    
    private void solve(){
        
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        boolean Takahashi = true;
        for (int index=0; index<K; index++){
            if (Takahashi){
                if (A%2==1){
                  A-=1;  
                } 
                B=B+(A/2);
                A/=2;
                Takahashi=false;
            } else {
                if (B%2==1){
                  B-=1;  
                } 
                A=A+(B/2);
                B/=2;
                Takahashi=true;
            }
        }
        
        System.out.print(A);
        System.out.print(" ");
        System.out.println(B);
    }
}