import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    String Burger = makeBurger(N);
    String[] B = new String[Burger.length()];
    for(int i = 0;i < Burger.length();i++){
      B[i] = Burger.substring(i,i + 1);
    }
    long sum = 0;
    for(int i = Burger.length() - X;i < Burger.length();i++){
      if(Long.parseLong(B[i]) == 1){
        sum++;
      }
    }
    System.out.println(sum);
  }




  public static String makeBurger(int N){
    if(N == 0){
      return "1";
    }
    String preBurger = makeBurger(N - 1);
    return "0" + preBurger + "1" + preBurger + "0"; 
  }
}
