import java.util.*;


public class Main {
  public static void main(String[] args) {

  Scanner vd = new Scanner(System.in);
  String n = vd.next();
  
  if(n.substring(0, 1) != "A") System.out.println("WA");
  else{
    String p = n.substring(3, n.length());
    int x = p.replaceAll("C", "Cc").length() - p.length();
    if(x ==1 ) {
        String f = n.substring(1);
        int i = f.indexOf("C");
        String fo = f.substring(0, i);
        String en = f.substring(i+1);
        if(fo.toLowerCase() != fo) System.out.println("WA");
        else{
            if(en.toLowerCase() != en) System.out.println("WA");
            else System.out.println("AC");
        }
    }
    else System.out.println("WA");
  }
 }
}