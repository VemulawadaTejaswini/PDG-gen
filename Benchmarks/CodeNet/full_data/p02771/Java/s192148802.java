import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   boolean flag=false;
   
   if((a=b&&a!=c)||(a=c&&a!=b)||(c=b&&a!=c)){
   flag=true;
   }

   if(flag){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
 
 }
}