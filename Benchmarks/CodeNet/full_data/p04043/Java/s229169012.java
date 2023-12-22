import java.util.Scanner;
public class Main{
  public static void main (String args[]){
     Scanner scan = new Scanner(System.in);
        int  A = scan.nextInt();
   			 if(A == 5 || A == 7){
                  Scanner scan2 = new Scanner(System.in);
                 int B  = scan2.nextInt();
      if(B == 5 || B==7){
        if(A== 7 && B==7){
       System.out.println("NO");

}
        Scanner scan3 = new Scanner(System.in);
	int C = scan3.nextInt();
        if( A + B + C ==17){
          System.out.println("Yes");

          }
          else{
                             System.out.println("NO");
             
            }
      }else{
         System.out.println("NO");
       }
      }else{
                              System.out.println("NO");
                         }
                          scan.close();
      
    }
  }