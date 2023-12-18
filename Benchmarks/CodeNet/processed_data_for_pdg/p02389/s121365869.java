public class Main{
  public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    int x = num.nextInt();
    int y = num.nextInt();
    int area = x * y;
    int length = x * 2 + y * 2;
    System.out.println(area + " "+ length);
  }
}
