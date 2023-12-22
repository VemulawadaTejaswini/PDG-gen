import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int w = scan.nextInt();
    int n = scan.nextInt();
    int[] c = new int[n];
    for (int i=0;i<n;i++){
      c[i] = scan.nextInt();
    }

    ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    for (int i=0;i<h;i++){
      ArrayList<Integer> b = new ArrayList<Integer>();
      a.add(b);
    }

    int f = 1;
    int current = 0;

    for (int i=0;i<n;i++){
      int count = c[i];
      while (count > 0){
        ArrayList<Integer> g = a.get(current);
        g.add(i+1);

        current += f;
        if (current == h){
          current = h-1;
          f = -1;
        }

        if (current == -1){
          current = 0;
          f = 1;
        }

        count -= 1;
      }
    }

    for (int j=0;j<h;j++){
      ArrayList<Integer> m = a.get(j);
      for (int k=0;k<w-1;k++){
        System.out.print(m.get(k) +" ");
      }
      System.out.println(m.get(w-1));
    }




  }

}
