public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean tmp = true;
    int i = 0;
    while(tmp == true){
      int x = sc.nextInt();
      if(x == 0){
        tmp = false;
        break;
      }
      i += 1;
      System.out.println("Case " + i + ": " + x);
    }
  }
}
