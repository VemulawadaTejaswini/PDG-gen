import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),f=0;
    for(int i=1;i<=n;i++){
      if(i<=k){
        f+=x;
      }else{
        f+=y;
      }
    }
  }
}