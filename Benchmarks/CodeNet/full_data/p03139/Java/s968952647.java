import java.util.Scanner;
public class Main{
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         int x = scan.nextInt();
         int y = scan.nextInt();
         int z = scan.nextInt();
         scan.close();
         if (y>z) {
             System.out.print(z);
         } else if (y<z) {
             System.out.print(y);
         } else {
             System.out.print(y);
         }
         System.out.print(" ");
 
         if (x==y && y==z) {
             System.out.print(x);
         } else { 
             if (x > (y+z)) {
                 System.out.print("0");
             }else if (x < (y+z)){
                 if (y<z){
                 int n = z-y;
                 System.out.print(n);
             }else{
                 int n = y-z;
                 System.out.print(n);
             }
        }
    } 
}