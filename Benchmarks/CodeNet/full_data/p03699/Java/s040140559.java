import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),max=0,sum=0;
    int[] s=new int[n];
    for(int i=0;i<n;i++){
      s[i]=sc.nextInt();
    }
    for(int i=0;i<(1<<n);i++){
      for(int j=0;j<n;j++){
        if((i>>j&1)==1){
          sum+=s[i];
        }
      }
      if(sum%10==0){
        sum=0;
      }
      max=Math.max(max,sum);
      sum=0;
    }
    System.out.println(max);
          
  }
}
