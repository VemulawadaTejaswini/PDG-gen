import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int coina;
    int coinb;
    int toyc;
    Scanner sc = new Scanner(System.in);
    System.out.println("Coin A Coin B Toy's price");
    coina = sc.nextInt();
    coinb = sc.nextInt();
    toyc = sc.nextInt();
    if(coina+coinb<toyc){
      System.out.println("no");

    }
    else{System.out.println("yes");
  }
    }
}
