
package game;

import java.util.Scanner;


public class Game {

  
    public static void main(String[] args) {
        int a;
       Scanner sc = new Scanner(System.in);
       a= sc.nextInt();
       if(a<4)
       {
           System.out.print("No");
       }
       else if(a%4==0 || a%7==0)
       {
           System.out.print("Yes");
       }
       else if(4+7==a)
       {
            System.out.print("Yes");
                    
       }
       
       else System.out.print("No");
    }
    
}
