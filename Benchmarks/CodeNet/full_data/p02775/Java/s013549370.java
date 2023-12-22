import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int[] num=new int[str.length()];
    int ans=0;
    
    for(int i=0;i<str.length();i++){
      num[i]=Character.getNumericValue(str.charAt(i));
    }

    for(int i=0;i<str.length();i++){
      if(num[i]>=0&&num[i]<=5){
        ans+=num[i];
      }else{
        ans+=(10-num[i]+1);
      }
    }
    
    System.out.print(ans);
  }
}