import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String head = s.substring(0,1);
    String last = s.substring(2,s.length()-1);
    int ch = 0;
    if(head.equals("A"))ch++;
    if(last.length() - last.replace("C","").length() == 1)ch++;
    if(ch != 2){
      System.out.println("WA");
      return;
    }
    last = s.substring(2,s.length());
    last = last.replace("C","");
    String ALP[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    for(String al:ALP){
      if(last.contains(al) || s.substring(1,2).equals(al)){
        System.out.println("WA");
        return;
      }
    }
    System.out.println("AC");
  }
}
