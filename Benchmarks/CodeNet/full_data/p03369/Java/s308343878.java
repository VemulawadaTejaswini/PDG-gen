import java.util.*;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int ramen = 700;
  String[] s = new String[3];
  for (int i = 0; i < 3; i++){
    s[i] = sc.next();
    if(s[i].equals("o")){
      ramen += 100;
    }
  }
  System.out.println(ramen);
  }
}
