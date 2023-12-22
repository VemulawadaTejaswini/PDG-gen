import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextint();

        sc.close();

        
        if (B == 1) {
            System.out.println(0);
        } else if(A>=B){
            System.out.println(1);
        } else{
            int ans = 0;
            while (true){
                B = B - (A-1);
                ans++;
                if (B <= A){
                    break; 

                }
            }
            System.out.println(ans+1);
        }
    }
       
}       