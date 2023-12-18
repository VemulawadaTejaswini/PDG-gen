class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int d = 0;
    if(a > b){
      d = a; a = b; b = d;
    }
    if(b > c){
      d = b;b = c;c = d;
    }
    if(a > b){
      d = a;a = b;b = d;
    }
    System.out.println(a+" "+b+" "+c);
  }
}
