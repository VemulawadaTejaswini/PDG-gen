import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    String n = sc.next();
    if(n.equals("100")){
      n = "101";
    }
    for(int i = 0;i<d;i++){
      n = n + "00";
    }
    System.out.println(n);
  }
}
