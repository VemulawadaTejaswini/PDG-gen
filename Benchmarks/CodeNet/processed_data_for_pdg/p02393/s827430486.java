public class  Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a,b,c;
    a=scan.nextInt();
    b=scan.nextInt();
    c=scan.nextInt();
    if(a>b){
      if(b>c){
        System.out.println(c+" "+b+" "+a);
      }else if (a>c){
        System.out.println(b+" "+c+" "+a);
      }else {
        System.out.println(b+" "+a+" "+c);
      }
    }else if(b>a){
      if(a>c){
        System.out.println(c+" "+a+" "+b);
      }else if(b>c){
        System.out.println(a+" "+c+" "+b);
      }else {
        System.out.println(a+" "+b+" "+c);
      }
    }
  }
}
