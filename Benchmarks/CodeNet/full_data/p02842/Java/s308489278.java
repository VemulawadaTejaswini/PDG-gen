import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
 
   boolean flg = false;
   int ans = 0;
   for(int i=1;i<46300;i++)
   {
     if(i*108/100==N)
     {
       ans=i;
       flg=true;
       break;
     }
   }
   if(flg) System.out.println(ans);
   else System.out.println(":(");
 }
}