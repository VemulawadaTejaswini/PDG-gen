import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] A = new int[N];
   int count=0;
   
   for(int i=0;i<N;i++){
     A[i] = sc.nextInt();
     if(A[i]%2==0&&(A[i]%3!=0||A[i]%5!=0)){
     	count=count+1;
     }
   }
      
      
   if(count>0){
     System.out.println("DENIED");
   }else{
     System.out.println("APPROVED");
   }
 
 }
}
