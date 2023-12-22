import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] a = new int[n];
    int[] b = new int[n];
    int[] c = new int[n];
    int count = 1;
    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
      b[i] = scan.nextInt();
      c[i] = i;
      count *= (i+1);
    }

    double sum = 0;
    ArrayList<String> g = new ArrayList<String>();
    sum = permutation(c,n,g,sum,a,b);

    double p = (double) sum/count;
    System.out.println(p);


  }

  static double permutation(int[] a, int n, ArrayList<String> g, double sum,int[] c, int[] b){
    if (g.size() == n){
      for (int k=0;k<g.size()-1;k++){
        int a1 = Integer.parseInt(g.get(k));
        int a2 = Integer.parseInt(g.get(k+1));
        sum += calculate(c[a1],b[a1],c[a2],b[a2]);
      }
      return sum;
    }

    for (int i = 0; i<n; i++){
      if (g.contains(a[i]+"") == false){
        g.add(a[i]+"");
        sum = permutation(a,n,g,sum,c,b);
        g.remove(a[i]+"");
      }
    }
    return sum;
  }

  static double calculate(int a, int b, int c, int d){
    int len = (int) (a-c)*(a-c) + (b-d)*(b-d);
    double gg = (double) Math.sqrt(len);
    return gg;
  }

}
