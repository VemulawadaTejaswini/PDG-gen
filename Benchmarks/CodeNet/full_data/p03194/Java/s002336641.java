import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    long p = sc.nextLong();
    long l = sc.nextLong();
    
    long ans =1;
    
    long first = l;
    
    long count=0;
    
     for(long i=2; i<=Math.sqrt(l);i++){
       if(i==l && l==first)break;
       
       if(l%i == 0){
         while (l%i==0){
           count++;
           l=l/i;
         }
         if(count >=p)ans=ans*(count/p)*i;
         count =0;
         }
         
       /*if(l%Math.pow(i,p)==0){
         ans=ans*Math.pow(i,p);
         l=l/(Math.pow(i,p));
       }else{
         while(l%i==0)l=l/i;
         }*/
        }
       
       System.out.println(ans);

  }
}