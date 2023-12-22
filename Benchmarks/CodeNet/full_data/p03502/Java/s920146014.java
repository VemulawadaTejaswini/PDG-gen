import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      String n = sc.next();
      int a = Integer.parseInt(n);
      int[]b = Integer.parseInt(n.split(""));
      int c = 0;
      for(int i = 0; i < b.length; i++){
        c = c + b[i];
      }
      if(a % c == 0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}
      