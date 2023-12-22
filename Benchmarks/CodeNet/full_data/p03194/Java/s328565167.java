import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    long p = sc.nextLong();
    long l = sc.nextLong();
    
    long ans =1;
    
    long first = l;
    
    long count=0;
    
     for(long i=2; i<=l;i++){
       if(i==l && l==first)break;
       if(l%i == 0){
         while (l%i==0){
           count++;
           l=l/i;
         }
         if(count >=p)ans=ans*(count/p)*i;
         count =0;
         }
    
       }
       
       System.out.println(ans);

  }
}