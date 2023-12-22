import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(sc.next());
    sb.replace(0, sb.length(), "x");
    System.out.println(sb.toString());
  }
}

    
    
