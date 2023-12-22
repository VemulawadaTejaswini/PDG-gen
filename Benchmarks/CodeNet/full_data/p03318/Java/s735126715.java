import java.util.Scanner;
public class Main{
  public static double r(int x){
    int x_ = x;
    int count = 0;
    while(x_ > 0){
      count = x_ % 10;
      x_ /= 10;
    }
    return (double)x / count;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    for(int j = 0; j < k; j++){
      if(r(j) <= r(j + 1))
        System.out.println(j);
    }
  }
}