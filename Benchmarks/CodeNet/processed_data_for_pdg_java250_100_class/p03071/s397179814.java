public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int max = Math.max(a,b);
      if(a==b){
        System.out.println(a+b);
        System.exit(0);
      }
      System.out.println(max + max-1);
  }
}
