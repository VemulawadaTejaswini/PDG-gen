import java.util.Scanner;
public class A {
  public static void main(String[] args){
    short coina;
    short coinb;
    short toyc;
    Scanner sc = new Scanner(System.in);
    System.out.print("Coin A: ");
    coina = sc.nextShort();
    System.out.print("Coin B: ");
    coinb = sc.nextShort();
    System.out.print("Toy's price: ");
    toyc = sc.nextShort();
    if(coina+coinb<toyc||coina<0||coinb<0){
      System.out.println("no");

    }
    else{System.out.println("yes");
  }
    }
}
