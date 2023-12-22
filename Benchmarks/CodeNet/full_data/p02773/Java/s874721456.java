import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   String[] a = new String[N];
   for(int i=0;i<N;i++) a[i] = sc.next();
   Arrays.sort(a);
   int tmp = 1;
   int anstmp = 1;
   String tt = a[0];
   List<String> nn = new ArrayList<>();
   nn.add(a[0]);
   for(int i=1;i<N;i++) 
   {
     if(tt.equals(a[i]))
     {
       tmp++;
       if(tmp==anstmp)
       {
         nn.add(a[i]);
       }
       if(tmp>anstmp)
       {
         anstmp = tmp;
         nn.clear();
         nn.add(a[i]);
       }
     }
     else
     {
       tmp = 1;
       tt = a[i];
       if(anstmp==1)
       {
         nn.add(a[i]);
       }
     }
   }
 

   for(int i = 0 ; i < nn.size() ;i++)
   {
     System.out.println(nn.get(i));
   }
 }
}