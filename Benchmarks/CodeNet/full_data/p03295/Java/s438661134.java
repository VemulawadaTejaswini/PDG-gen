import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a;
    int b;
    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    for (int i=0;i<m;i++) {
      a = sc.nextInt();
      b = sc.nextInt();
      ArrayList<Integer> alist = new ArrayList<>();
      alist.add(a); alist.add(b);
      list.add(alist);
    }
    Collections.sort(
        list,
        new Comparator<ArrayList<Integer>>() {
          public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            return list1.get(0)-list2.get(0);
          }
        }
        );
    List<Integer> al = new ArrayList<>();
    List<Integer> bl = new ArrayList<>();
    al.add(list.get(0).get(0));
    bl.add(list.get(0).get(1));
    int ag;
    int bg;
    int max;
    int min;
loop:
    for (int i=1;i<m;i++) {
      a = list.get(i).get(0);
      b = list.get(i).get(1);
      for (int j=0;j<al.size();j++) {
        ag = al.get(j);
        bg = bl.get(j);
        min = Math.max(a,ag);
        max = Math.min(b,bg);
        if (min<max) {
          al.set(j,min);
          bl.set(j,max);
          continue loop;
        }
      }
      al.add(a);
      bl.add(b);
    }
    System.out.println(al.size());
  }
}
