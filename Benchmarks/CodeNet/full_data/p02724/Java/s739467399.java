import java.util.Scanner;

public class Main{
    
 
    public static void main(String[] args)  {
        new Main().solve();
    }

    void solve(){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        
        int fhund, fyen;
        int b;

        fhund = a / 500;
        b = a % 500;
        fyen = b / 5;

        System.out.println((fhund * 1000) + (fyen * 5));



    }
}