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
      s--;
    }else{
      t--;
    }
      
    System.out.println(sN + " " + tN);
  }
}