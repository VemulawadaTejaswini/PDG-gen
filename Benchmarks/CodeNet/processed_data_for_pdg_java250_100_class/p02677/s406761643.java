class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(); 
    int B = sc.nextInt(); 
    double H = sc.nextInt(); 
    double M = sc.nextInt(); 
    double Y = 360 * (H / 12)+30*(M/60);
    double X = 360 * (M / 60);
    double angle = X - Y;
    double C = 0.00000000000000;
    C = A*A + B*B - 2*A*B*Math.cos(Math.toRadians(angle));
    System.out.println(Math.sqrt(C));
  }
}
