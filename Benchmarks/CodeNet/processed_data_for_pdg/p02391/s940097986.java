public class  Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a,b;
    a=scan.nextInt();
    b=scan.nextInt();
    if(a<b){
      System.out.println("a < b");
    }else if (b<a) {
      System.out.println("a > b");
    }else{
      System.out.println("a == b");
    }
  }
}
