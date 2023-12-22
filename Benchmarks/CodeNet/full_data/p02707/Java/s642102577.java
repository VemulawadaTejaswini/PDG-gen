import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
  int n=kbd.nextInt();
    int[] A= new int[n+1];
    for(int i=0;i<n-1;i++){
      A[kbd.nextInt()]++;
}
for(int t=1;t<=n;t++){
 System.out.println(A[t]);
}
}
}
