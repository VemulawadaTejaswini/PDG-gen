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
          ArrayList<Integer> d = c.get(j);
          d.add(i);
          break;
        }
      }

    }

    for (int i=0;i<26;i++){
      ArrayList<Integer> a1 = b.get(i);
      boolean f = false;

      for (int j=0;j<26;j++){
        ArrayList<Integer> a2 = c.get(j);

        if (a2.size() != a1.size()){
          continue;
        }

        if (find(a1,a2) == 1){
          f = true;
          break;
        }
      }

      if (f == false){
        System.out.println("No");
        return;
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
