public class mean{
  public static void main(Atring[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c =(a+b)/2;
    if(((float)a+(float)b)/2-c<0.5){
      System.out.println(c);
    }else{
      System.out.println(c+1);
    }
  }
}