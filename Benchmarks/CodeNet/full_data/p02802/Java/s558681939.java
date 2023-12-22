import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int M = sc.nextInt();
   int[] p =new int[M];
   String[] s =new String[M];
   for(int i=0;i<M;i++) 
   {
     p[i] = sc.nextInt();
     s[i] = sc.next();
   }
   int ans =0;
   int wan =0;
   int qtmp =0;
   boolean wa = true;
   boolean nb = false;
   for(int i=0;i<M;i++)
   {
     if(qtmp != p[i])
     {
       qtmp =p[i];
       wa = true;
       nb = false;
     }
     else if (nb)
     {
       continue;
     }
     
     if(s[i].equals("AC")&&wa)
     {
       wa = false;
       nb = true;
       ans++;
     }
     else if(s[i].equals("WA")&&(wa)) wan++;
   }
   System.out.println(ans+ " " + wan);
 }
}