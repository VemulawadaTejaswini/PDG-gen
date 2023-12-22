import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
      //入力
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      //計算
      long sum = 0;
      for(int i=1; i<n; i++) sum += i;
      
      
      //出力
      System.out.println(sum);
      
    }
      
}

