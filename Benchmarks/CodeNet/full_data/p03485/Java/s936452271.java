import java.util.Scanner; 
class Main{
  public static void main (String[] args){
    Scanner scanner =new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c;
    
    if((a+b)%2==0)
      System.out.println((a+b)/2);
    else
      System.out.println((a+b)/2+1);
    scanner.close();
  }
}