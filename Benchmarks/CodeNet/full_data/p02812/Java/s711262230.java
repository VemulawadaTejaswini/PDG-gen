import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   char[] c = sc.next().toCharArray();
   int ans =0;
   boolean a = false;
   boolean b = false;
     for(int i =0;i<N;i++)
     {
       if(a)
       {
         a = false;
         if(c[i]=='b') b = true;
       }
       else if(b)
       {
         b = false;
         if(c[i]=='c') ans++;
       }
       else if(c[i]=='a')
       {
         a = true;
       }
     }
     System.out.println(ans);
 }
}