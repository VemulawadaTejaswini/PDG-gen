import java.util.*;

public class Main{
    static int H,W,A,B;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        H = sc.nextInt();
        W = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        for(int i = 1; i <= H; i++){
            for(int j = 1; j <= W; j++){
                if(i <= B){
                    if(j <= A)
                        System.out.print("0");
                    else
                        System.out.print("1");
                } else {
                    if(j <= A)
                        System.out.print("1");
                    else
                        System.out.print("0");
                }
            }
            System.out.println();
        }
        
    }
}