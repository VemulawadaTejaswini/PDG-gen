import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     
   int n = sc.nextInt();
   int  k =sc.nextInt();
   long s =0;
   int[] a = new int[n];
   for(int  i=0;i<n;++i){
       a[i]= sc.nextInt();
      
   }
   Arrays.sort(a);
   
   for(int j =0;j<a.length-k;j++){
        s+=a[j];
   }
      
   
   System.out.println(s);
  
    }
}