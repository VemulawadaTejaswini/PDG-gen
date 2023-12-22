import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
      //入力
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      //計算
      double p = 0;
      int sum = 0;
      for(int i=1;i<=n;i++) {
        if(i%2!=0) sum += 1;
      }
      p=(double)sum/n;
      
      //出力
      System.out.println(p);
      
    }
      
}

