public class TwoCoins{
  public static void main(string args[]){
    int coinVal;
    int coinVal2;
    int toyPrice;
    
    Scanner scanner = new Scanner(System.in);
    coinVal = scanner.nextInt();
    coinVal = scanner.nextInt();
    toyPrice = scanner.nextInt();
    
    if(coinVal+coinVal2 >= toyPrice){
      system.out.println("yes");
    }else{
      system.out.println("no");
    }
  }
}
