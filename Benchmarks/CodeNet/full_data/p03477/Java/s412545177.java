import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      int d = Integer.parseInt(sc.next());
      int right = c + d;
      int left = a + b;
      if(left > right){
        System.out.println("Left");
      }
      if(left == right){
        System.out.println("Balanced");
      }
      if(left < right){
        System.out.print("Right");
      }
    }
  }
}
      
    