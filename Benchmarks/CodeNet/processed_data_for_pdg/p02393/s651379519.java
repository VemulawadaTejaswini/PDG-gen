public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        if(a>b){
          int temp = a;
          a = b;
          b = temp;
        }
        if(b>c){
          int temp = b;
          b = c;
          c = temp;
        }
      }
    }
    System.out.printf("%d %d %d\n", a, b, c);
    sc.close();
  }
}
