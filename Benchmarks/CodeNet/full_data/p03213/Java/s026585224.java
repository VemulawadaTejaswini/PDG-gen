import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int ans =0;
    
    int c75=0;
    int c25=0;
    int c15=0;
    int c5=0;
    int c3=0;
    
    
    int[] f= new int [n+1];
    
    for(int j=2;j<=n;j++){
      int l=j;
    for(int i=2; i<=l;i++){
         while (l%i==0){
           f[i]++;
           l=l/i;
       }
     }
   }
     
     for(int i=2;i<=n; i++){
       
        if(f[i] >= 74)c75++;
        if(f[i] >= 24)c25++;
        if(f[i] >= 14)c15++;
        if(f[i] >= 4)c5++;
        if(f[i] >= 2)c3++;
    }
    
    for(int i=1;i<=n; i++){
       
         System.out.println(i + " " + f[i]);
       
        
    }
    
    int ans1=0;
    int ans2=0;
    int ans3=0;
    int ans4=0;
    
    ans1=c75;
    ans2=c25*(c3-1);
    ans3=(c15)*(c5-1);
    if(c3>2)ans4=c5*(c5-1)/2*(c3-2);
    else ans4=0;
    ans= ans1+ans2+ans3+ans4;
   
     System.out.println(ans);
     
  }
  
}