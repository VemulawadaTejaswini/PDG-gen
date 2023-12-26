public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
      int a=sc.nextInt(); 
      int b=sc.nextInt(); 
      int t=sc.nextInt();
      int total;
      total=(int)(t+0.5)/a;
      System.out.println(total*b);
    }
  }
}
