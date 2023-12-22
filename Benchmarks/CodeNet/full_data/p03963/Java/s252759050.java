import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt(),ans=1;
    for(int i=1;i<=n;i++){
      if(i==1){
        ans*=k;
      }else{
        ans*=(k-1);
      }
    }
    System.out.println(ans);
  }
}
