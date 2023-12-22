import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    for(char i='a';i<='z';i++){
      if(s.indexOf(i) == -1){
        System.out.println(i);
        break;
      }else if(i == 'z'){
        System.out.println("None");
      }
    }
  }
}