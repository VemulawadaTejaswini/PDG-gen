import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int X = scanner.nextInt();
    int max = 0;

    while(true){
      int i = 0;
      int j = 0;
      for (i = 0; i <= Math.sqrt(X); i++){
        for (j = 0; j < 10; j++){
          if (max <= X){
          i *= i;
          max = Math.max(max, i);
          }
        }
      }
      if (i == Math.sqrt(X) && j == 9){break;}
    }
    System.out.println(max);
  }
}
