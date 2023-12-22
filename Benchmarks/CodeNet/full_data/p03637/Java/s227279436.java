import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] t = new int[N];
   for(int i=0;i<N;i++)  t[i] = sc.nextInt();
   
   int[] forans =new int[3];
   for(int i=0;i<N;i++) 
   {
     if(t[i]%4==0) forans[0]++;
     else if(t[i]%2==0) forans[1]++;
     else forans[2]++;
   }
   String ans ="";
   if(forans[1]==0)
   {
     if(forans[0]+1>=forans[2]) ans = "Yes";
     else ans = "No";
   }
   else
   {
     if(forans[0]>=forans[2]) ans = "Yes";
     else ans = "No";
   }
   System.out.println(ans);
 }
}