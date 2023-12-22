import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int sum = 0;

    if(a + b < c * 2){
      sum = a * x + b * y;
    }else{
      while(x >= 1 && y >= 1){
        sum += c * 2;
        x--;
        y--;
      }
      if(a >= c * 2 || b >= c * 2){
        if(x > y){
          for(int i = 0;i < x;i++){
            sum += c * 2;
          }
          x = 0;
        }else{
          for(int i = 0;i < y;i++){
            sum += c * 2;
          }
          y = 0;
        }
      }
      sum += a * x + b * y;
    }

    System.out.println(sum);
  }
}