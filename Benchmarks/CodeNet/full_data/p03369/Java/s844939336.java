import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new  Scanner(System.in);
    String s = sc.next();
    int num = 0;
    for(int i=0; i<3; i++){
      if(s.charAt(i) == 'o')num++;
    }
    System.out.println(700 + 100*num);
  }
}
      