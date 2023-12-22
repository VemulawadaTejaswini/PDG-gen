import java.util.*;

class Main{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);   
      String s = scan.next();
      System.out.println(s.matches("[A][a-z][a-z]*[C][a-z]*[a-z]") ? "AC" : "WA");
    }
}