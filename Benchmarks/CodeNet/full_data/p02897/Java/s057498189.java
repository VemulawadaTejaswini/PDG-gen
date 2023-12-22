import java.util.Scanner;

public class Main1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double p = 0;    //入力された値Nまでの奇数の個数

    int num = sc.nextInt();
    for(int i = 0; i <= num; i++){
      if((i % 2) == 1){
        p++;
      }
    }

    System.out.printf("%.10f \n" , p/num);
  }
}