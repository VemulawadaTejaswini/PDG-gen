import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    String t = scan.next();

    String a = "abcdefghijklmnopqrstuvwxyz";

    ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> c = new ArrayList<ArrayList<Integer>>();

    for (int i=0;i<26;i++){
      ArrayList<Integer> b1 = new ArrayList<Integer>();
      b1.add(-1);
      b.add(b1);
      ArrayList<Integer> c1 = new ArrayList<Integer>();
      c1.add(-1);
      c.add(c1);
    }

    for (int i=0;i<s.length();i++){
      for (int j=0;j<26;j++){
        if (a.charAt(j) == s.charAt(i)){
          ArrayList<Integer> d = b.get(j);
          d.add(i);
          break;
        }
      }

      for (int j=0;j<26;j++){
        if (a.charAt(j) == t.charAt(i)){
          ArrayList<Integer> e = c.get(j);
          e.add(i);
          break;
        }
      }
    }

    ArrayList<Character> check = new ArrayList<Character>();
    for (int i=0;i<s.length();i++){
      char g = s.charAt(i);
      if (check.contains(g)){
        continue;
      }
      else{
        check.add(g);
        for (int j=0;j<26;j++){
          if (g == a.charAt(j)){
            ArrayList<Integer> mm = b.get(j);
            boolean ff = false;
            for (int k=0;k<26;k++){
              ArrayList<Integer> nn = c.get(k);
              if (find(mm,nn) == 1){
                ff = true;
                break;
              }
            }
            if (ff == false){
              System.out.println("No");
              return;
            }
          }
        }
      }
    }
    System.out.println("Yes");
  }

  static int find(ArrayList<Integer> a, ArrayList<Integer> b){
    if (a.size() != b.size()){
      return 0;
    }

    for (int i=0;i<a.size();i++){
      if (a.get(i) != b.get(i)){
        return 0;
      }
    }
    return 1;
  }
}
