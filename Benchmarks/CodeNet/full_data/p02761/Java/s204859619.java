import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int n=kbd.nextInt();
   int m=kbd.nextInt();
   int[] kazu = new int[n+1];
   for(int i=0;i<n-1;i++){
     kazu[i]=0;
   }
   for(int i=0;i<m;i++){
     int a=kbd.nextInt();
     int b=kbd.nextInt();
     kazu[a-1]=b;
   }

   if(kazu[0]!=0){
     for(int i=0;i<n;i++){
     System.out.print(kazu[i]);
   }
 }else{
   System.out.println(-1);
 }
}
}
