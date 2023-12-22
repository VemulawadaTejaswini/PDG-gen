import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        if(k % 2 != 0){
            System.out.println((int)Math.pow(n / k, 3));
        }else{
            if(k - (k / 2) == 1){
                if(n % 2 == 0){
                    System.out.println((int)Math.pow(n / k , 3) + (int)Math.pow(n / 2, 3));
                }else{
                    System.out.println((int)Math.pow(n / k , 3) + (int)Math.pow((n / 2) + 1, 3));
                }
            }else{
                System.out.println((int)Math.pow(n / k , 3) + (int)Math.pow(n / (k - (k / 2)), 3));
            }
        }
    }
}
