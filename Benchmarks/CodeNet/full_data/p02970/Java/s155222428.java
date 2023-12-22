import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int D = sc.nextInt();
  
   if(N <= (2*D + 1)){
     System.out.println(1);
   }else{
     int num = 0;
    while(N>0){
     N -= (2*D + 1);
      num++;
    }
    System.out.println(num);
   }
   
 }
}