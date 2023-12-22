import java.util.Scanner;
 class Main {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String number = sc.next();
     number = number.replaceAll("0","");
     System.out.println(number.length);
   }
 }