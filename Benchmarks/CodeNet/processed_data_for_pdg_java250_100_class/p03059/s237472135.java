public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  
    int b = sc.nextInt();  
    int t = sc.nextInt();  
    int now = 0;
    now+=a;
    int count=0;
    while (now<=t){
      now+=a;
      count+=b;
    }
    System.out.println(count);
  }
}
