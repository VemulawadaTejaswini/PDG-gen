public class Main{
  public static void main(String[] args){
    int i = 1;
    Scanner scan = new Scanner(System.in);
    while(true){
    int x = scan.nextInt();
    if( x == 0 )break;
    System.out.println("Case "+i+": "+x+"");
    i++;
   }
  }
}
