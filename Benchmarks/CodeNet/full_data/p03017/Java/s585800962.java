import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String line = in.nextLine();
    int n = Integer.parseInt(line.split(" ")[0]);
    int s1 = Integer.parseInt(line.split(" ")[1]);
    int f1 = Integer.parseInt(line.split(" ")[2]);
    int s2 = Integer.parseInt(line.split(" ")[3]);
    int f2 = Integer.parseInt(line.split(" ")[4]);
    String fld = in.nextLine();
    in.close();
    
    String snr = fld.substring(s1-1, s2);
    String fnr = fld.substring(f1-1, f2);
    String o = "...";
    if (f2 < s2) o = fld.substring(f1-2, f2+1);
    if ( !snr.contains("##") && !fnr.contains("##") && o.contains("...")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}