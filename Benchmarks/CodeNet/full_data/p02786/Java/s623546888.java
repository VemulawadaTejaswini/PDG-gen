import java.util.*;
public class Main{
  
  static long findAns(long n,long ans,int count){
    if(n>1){
      ans+=Math.pow(2,count);
      ++count;
      findAns(n/2,ans,count);
    }
    else{
      ans+=Math.pow(2,count);
      return ans;
    }
  }
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long ans=0;
   	System.out.println(findAns(n,ans,0));
  }
}
