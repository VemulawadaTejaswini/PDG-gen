import java.util.*;
class Main {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    String t = scanner.next();
    int sN = scanner.nextInt();
    int tN = scanner.nextInt();
    
    String u = scanner.next();
    
    if(u==s){
      sN -= 1;
    }else if(u==t){
      tN -= 1;
    }else{
      
    }
      
    System.out.println(sN + " " + tN);
  }
}