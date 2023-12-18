public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int con;
    if(a > b){
      con = b;
      b = a;
      a = con;
    }
    if(b > c){
      con = c;
      c = b;
      b = con;
    }
    if(a > b){
      con = b;
      b = a;
      a = con;
    }
    System.out.println(a + " " + b + " " + c);
  }
}
