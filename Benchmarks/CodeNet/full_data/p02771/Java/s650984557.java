import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] A = new int[N];
   boolean flag=true;
   
   for(int i=0;i<N;i++){
     A[i] = sc.nextInt();
     if(A[i]%2==0&&(A[i]%3!=0&&A[i]%5!=0)){
     	flag=false;
     }
   }
      
      
   if(flag){
     System.out.println("APPROVED");
   }else{
     System.out.println("DENIED");
   }
 
 }
}
