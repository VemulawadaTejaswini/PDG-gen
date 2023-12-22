import java.util.Scanner;


public class Main{

     public static void main(String []args){
         System.out.println("hoge");
        Scanner scan = new Scanner(System.in);
        int str1 = scan.nextInt();
        int str2 = scan.nextInt();
 
        if(str1 == str2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        scan.close();
     }
}