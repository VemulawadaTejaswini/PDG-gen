import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    byte max = 0;
    byte min = 123;
    byte input;
    for(int i = 0; i < 5; i++){
      input = sc.nextByte();
      max = Math.max(max,input);
      min = Math.min(min,input);
    }
    byte k = sc.nextByte();
    if(k >= max - min){
      System.out.println("Yay!");
    }else{
      System.out.println(":(");
    }
  }
}