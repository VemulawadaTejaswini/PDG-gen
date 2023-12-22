import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      int num[]=new int[n];
      for(int i=0;i<n;i++){
      num[i]=sc.nextInt();
      }
      Arrays.sort(num);
      int ans=0;
      if(n%2==0){
      for(int i=0;i<n;i++){
        if(i<n/2)ans-=num[i]*2;
        else ans+=num[i]*2;
      }
        ans+=num[n/2];
        ans-=num[n/2+1];
      }
      else{
      	if(n%4==3){
          for(int i=0;i<n;i++){
        if(i<n/2)ans-=num[i]*2;
        else ans+=num[i]*2;
            
          
        }
          ans-=num[n/2];
          ans-=num[n/2+1];
        }
        else{
          for(int i=0;i<n;i++){
        if(i<n/2+1)ans-=num[i]*2;
        else ans+=num[i]*2;
        
        }
          ans+=num[n/2];
          ans+=num[n/2-1];
        }
        
      }
      System.out.println(ans);
    }
}