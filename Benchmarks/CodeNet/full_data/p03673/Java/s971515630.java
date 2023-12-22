import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    s.next();
    String line = null;
    Stack<Integer> stack = new Stack<>();
    try {
      while((line = s.next()) != null) {
        int i = Integer.parseInt(line);
        stack.push(i);
        Collections.reverse(stack);
      }
    } catch(Exception e){
    }
    String result = "";
    for(Integer item : stack) {
      result += item +" ";
    }
    System.out.println(result.substring(0,result.length()-1));
  }
}
