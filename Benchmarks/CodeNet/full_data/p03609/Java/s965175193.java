import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    String s = sc.next();
    ArrayList<Character> list = new ArrayList<Character>();
    for(int i = 0; i < s.length; i = i + 2){
      char c = s.charAt(i);
      list.add(c);
    } 
    System.out.println(list);
  }
}


