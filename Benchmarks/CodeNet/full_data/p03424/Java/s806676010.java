import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String colorNumber = "Three";
    int a = 0;
    for(int i = 0; i < N; i++){
      String str = sc.next();
      if(str.equals("Y")) a = 1;
      if(a == 1){
        colorNumber = "Four";
        break;
      }
    }
    System.out.println(colorNumber);
  }
}
