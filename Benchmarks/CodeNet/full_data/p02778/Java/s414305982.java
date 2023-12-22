import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String word = sc.next();
    int cnt = word.length();
    
    for(int i=0; i<cnt; i++){
      System.out.print("x");
    }
  }
}
