import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt(); //総商品数
    int m = sc.nextInt(); //選びたい商品数
    
    int[] param = new int[n];
    long sum1 = 0; //総得票数
    int sum2 = 0; //選ぶことができる商品数
    
    //全ての商品の票数を入力する
    for(int i = 0 ; i<n ; i++){
      param[i] = sc.nextInt();
      sum1 += param[i];
    }
    
    //全ての票数と条件とを照らし合わせる
    for(int i=0 ; i<n ; i++){
      if( param[i] >=(double)(sum1/(4*m)) ){
        sum2++;
      }
    }
    
    //選ぶことができるかどうかを確かめる
    if(sum2>=m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}