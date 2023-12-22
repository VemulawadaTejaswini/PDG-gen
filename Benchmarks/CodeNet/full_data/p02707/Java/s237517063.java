import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
  int n=kbd.nextInt();
    int[] A= new int[n];
    for(int i=0;i<n-1;i++){
      A[i]=kbd.nextInt();
 }
   int[] B= new int[n+1];
   for(int t=1;t<=n;t++){
   for(int i=0;i<n-1;i++){
     if(A[i]==t){
      B[t]=B[t]+1;
     }
}
}
for(int t=1;t<=n;t++){
 System.out.println(B[t]);
}
}
}