import java.util.Scanner;
class Main {
 public static void main(String[] args) {
   int h = 0;
   Scanner scanner = new Scanner(System.in);
   int c = scanner.nextInt();
   if(c == 0) { 
     return 0;
   } else {
     int fh = c/500;
     c = c%500;
     int f = c/5;
     h = fh*1000 + f*5;
     return h;
   }
 }
}