import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt(); //総商品数
    int m = sc.nextInt(); //選びたい商品数
    
    int[] param = new int[n];
    int sum1 = 0; //総得票数
    int sum2 = 0; //選ぶことができる商品数
    
    for(int i = 0 ; i<n ; i++){
      param[i] = sc.nextInt();
      sum1 += param[i];
    }
    
    for(int i=0 ; i<n ; i++){
      if( param[i]>sum1/(4*m) ){
        sum2++;
      }
    }
    
    if(sum2>=m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}