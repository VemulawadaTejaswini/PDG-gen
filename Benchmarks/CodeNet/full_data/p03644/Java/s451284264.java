import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    
    int ans=1;
    for(int i=0;i<n;i++){
      if(n>ans*2){
        ans*=2;
      }else{
        System.out.println(ans);
        break;
      }
    }
    

    sc.close();
  }
}