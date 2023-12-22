import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    byte a = sc.nextByte();
    byte b = sc.nextByte();
    byte c = sc.nextByte();
    if((a == b && b == c) || ((a != b) && (b != c) && (c != a))){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}