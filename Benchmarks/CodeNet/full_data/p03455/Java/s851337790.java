import java.util.*;
class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  int a = sc.nextint();
  int b = sc.nextint();
  if((a * b) % 2 == 0 )
    System.out.println("Even");
    else
    System.out.println("Odd");
}
}