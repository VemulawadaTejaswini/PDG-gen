import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int train_fee = n * a;
    if(train_fee > b){
      System.out.println(b);
    }else if(b > train_fee){
      System.out.println(train_fee);
    }else if(b == train_fee){
      System.out.println(b);
    }
  }
}