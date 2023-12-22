import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    String colorNumber = "Three";
    for(int i = 0; i<N; i++){
      if(scanner.next() == "Y"){
        colorNumber = "Four";
        break;
      }
    }
    System.out.println(colorNumber);
  }
}
