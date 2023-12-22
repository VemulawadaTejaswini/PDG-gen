import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    String g = n+"";
    int k = g.length();
    long ret = 0;
    ArrayList<String> c = new ArrayList<String>();
    ArrayList<String> b = new ArrayList<String>();
    ArrayList<String> a = new ArrayList<String>();
    a = find(k,c,b);
    for (String t : a){
      long gg = Long.parseLong(t);
      if (gg <= n){
        ret += 1;
      }
    }
    System.out.println(ret);
  }

  static boolean check(String a){
    int a3 = 0;
    int a5 = 0;
    int a7 = 0;
    for (int i=0;i<a.length();i++){
      if (a.charAt(i) == '3') {
        a3 += 1;
      }
      if (a.charAt(i) == '5') {
        a5 += 1;
      }
      if (a.charAt(i) == '7') {
        a7 += 1;
      }
    }
    if ((a3 == 0) || (a5 == 0) || (a7 == 0)){
      return false;
    }
    return true;
  }

  static ArrayList<String> find(int n, ArrayList<String> b, ArrayList<String> c){
    if (b.size() == n){
      String cc = concate(b);
      if (check(cc) == true){
        c.add(cc);
      }
      return c;
    }

    String cc = concate(b);
    if (check(cc) == true){
      c.add(cc);
    }

    String [] app = new String[]{"3","5","7"};
    for (int i=0;i<3;i++){
      b.add(app[i]);
      c = find(n,b,c);
      b.remove(b.size()-1);
    }
    return c;

  }

  static String concate(ArrayList<String> a){
    String ret = "";
    for (String g : a){
      ret += g;
    }
    return ret;
  }
}
