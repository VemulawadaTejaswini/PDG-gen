import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    byte i1 = sc.nextByte();
    byte i2 = sc.nextByte();
    byte i3 = sc.nextByte();
    if(i1 + i2 + i3 > 21){
      System.out.println("bust");
    }else{
      System.out.println("win");
    }
  }
}