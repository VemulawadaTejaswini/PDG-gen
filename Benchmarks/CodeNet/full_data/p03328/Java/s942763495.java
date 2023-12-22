import java.util.Scanner;

class Main{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c;
   int d = 0;
   for(c=1;c<(b-a);c++){
     d += c;
   }
   System.out.println(d-a);
  }
}