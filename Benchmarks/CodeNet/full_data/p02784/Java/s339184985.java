import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int H = sc.nextInt();
   int N = sc.nextInt();
   int[] A = new int[N];
   int sum=0;
   
   for(int i=0;i<N;i++){
     A[i]=sc.nextInt();
     sum=sum+A[i];
   }

   if(sum>=H){
     System.out.println("Yes");
   }else {
     System.out.println("No");
   }
 
 }
}
