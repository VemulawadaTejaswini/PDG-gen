public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(b==1) {
      System.out.println(0);
      System.exit(0);
    }
    if(a>b) {
      System.out.println(1);
      System.exit(0);
    }
    int ans = 1; 
    b += -a;      
    --a;          
    if(b%a == 0)
      ans += b/a;
    else
      ans += b/a+1;
    System.out.println(ans);
  }
}
