import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      long k = sc.nextLong();
      long cnt = 1;
      long sum = -1;
      long a = 0;
      long b = 0;
      
      for(int i = 0;i < s.length()-1;i++){
        if(s.charAt(i)==s.charAt(i+1))cnt++;
        else if(sum==-1){
          a=cnt;
          sum=0;
          cnt=1;
        }else{
          sum+=cnt/2;
          cnt=1;
        }
      }
      b=cnt;
      long ans = 0;
      if(s.charAt(s.length()-1)==s.charAt(0))ans = sum*k+((a+b)/2)*(k-1)+a/2+b/2;
      else{
        sum+=a/2+b/2;
        ans=sum*k;
      }
      System.out.println(ans);
    }
}