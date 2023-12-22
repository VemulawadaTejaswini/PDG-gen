import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = b;
    int i = 1;
    while(b <= a){
      i++;
      b *= c;
    }
    System.out.println(i);
  }
}