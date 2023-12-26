public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int m = sc.nextInt();
    double small = 30 * h + 30 * (double)m/60;
    double big = 360 * (double)m/60;
    double reg = small - big;
    if(reg>180){
      reg = 360 - reg;
    }else if(reg<-180){
      reg = reg + 360;
    }
    double ans = a*a + b*b - 2 * a * b * Math.cos(Math.toRadians(reg));
     ans = Math.sqrt(ans);
    System.out.println(ans);
  }
}
