import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int H = sc.nextInt();
   int A = sc.nextInt();

   for(int i=0;;i++){
    H=H-A;
     if(H<=0){
     break;
       System.out.println(i);
     }
   }
   
 }
}
