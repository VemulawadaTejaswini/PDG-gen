class Main {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    if(a <= 5) System.out.println("0");
   	else if(a <=12) System.out.println(b/2);
    else System.out.println(b);
  }
}