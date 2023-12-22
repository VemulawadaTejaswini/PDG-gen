import java.util.Scanner;
 class Main {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     number = number.replaceAll("0","");
     System.out.println(number.length);
   }
 }