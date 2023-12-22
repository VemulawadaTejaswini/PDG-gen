import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int H = scanner.nextInt();
    int A = scanner.nextInt();
    int i = 0;
    
    while( H < A * i){
      i++;
    }
    System.out.println(i);
  }
}