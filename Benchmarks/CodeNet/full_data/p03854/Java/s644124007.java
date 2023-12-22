import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String tgt = sc.next();
    String[] strs = {"dream", "dreamer", "erase", "eraser"};
    StringBuilder new_str = new StringBuilder();
    for(String str : strs){
        String new_str_2 = str;
        new_str = new StringBuilder(new_str_2);
        for(String s : strs){
            new_str.append(s);
            if(tgt.equals(new_str.toString())){
                System.out.println("YES");
                return;
            }
            new_str.replace(0, new_str.length(), new_str_2);
        }
        new_str.setLength(0);
    }
    System.out.println("NO");
  }
}