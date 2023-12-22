import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String b = sc.next();
    String res  = "";
    switch (b){
        case "A":
            res = "T";
            break;
        case "C":
            res = "G";
            break;
        case "G":
            res = "C";
            break;
        case "T":
            res = "A";
            break;
    }
    System.out.println(res);
  }
  
}