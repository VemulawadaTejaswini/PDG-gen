import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int n =kbd.nextInt();
   long c=0;
   for(int i=1;i<n+1;i++){
     if(i%3!=0&&i%5!=0){
       c=c+i;
     }
   }
   System.out.println(c);
 }
}
