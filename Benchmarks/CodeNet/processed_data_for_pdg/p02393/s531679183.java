class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int wk;
    if (a > b) {
      wk = a;
      a  = b;
      b  = wk;
    }
    if (b > c) {
      wk = b;
      b  = c;
      c  = wk;
    }
    if (a > b) {
      wk = a;
      a  = b;
      b  = wk;
    }
    System.out.println(a+" "+b+" "+c);
  }
}
