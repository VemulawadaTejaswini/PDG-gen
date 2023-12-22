import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
      //入力
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int count = a;
      int min = 1;
      for (int i=2;i<20; i++) {
        count += a-1;
        if(count>=b) {
          min = i;
          break;
        }
      }
      
      System.out.println(min);
      
    }
      
}

