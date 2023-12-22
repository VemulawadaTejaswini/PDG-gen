import java.util.*;
class Main {
  public static void main(String[]args){
    Scanner scanner = new scanner(System.in);
    String s = scanner.next();
    String t = scanner.next();
    int sN = scanner.nextInt();
    int tN = scanner.nextInt();
    
    String u = scanner.next();
    
    if(u==s){
      s -= 1;
    }else{
      t -= 1;
    }
      
    System.out.println(sN + " " + tN);
  }
}