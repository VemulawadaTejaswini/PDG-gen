import java.util.Scanner; 
class Main{
  public static void main (String[] args){
    Scanner scanner =new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    if(a+b>c+d)
      System.out.println("Left");
    else if(a+b<c+d)
      System.out.println("Right");
    else
      System.out.println("Balanced");
    scanner.close();
  }
}