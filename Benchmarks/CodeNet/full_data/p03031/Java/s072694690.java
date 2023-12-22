import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    for (int i=0;i<n;i++){
      ArrayList<Integer> aa = new ArrayList<Integer>();
      a.add(aa);
    }
    for (int i=0;i<m;i++){
      int k = scan.nextInt();
      for (int j=0;j<k;j++){
        int tt = scan.nextInt();
        ArrayList<Integer> b = a.get(tt-1);
        b.add(i+1);
      }
    }

    int [] p = new int[m];
    for (int l=0;l<m;l++){
      p[l] = scan.nextInt();
    }

    int sum = 0;
    int combination = (int) Math.pow(2,n);
    for (int i=0;i<combination;i++){
      int [] c = per(i,n);
      int[] ch = new int[m];
      for (int j=0;j<n;j++){
        if ((a.get(j).size() == 0) || (c[j] == 0)){
          continue;
        }
        ArrayList<Integer> d = a.get(j);
        for (int t : d){
          ch[t-1] += 1;
        }
      }
      sum += check(ch,p);
    }

    System.out.println(sum);
  }

  static int check(int[] a, int[] b){
    for (int i=0;i<a.length;i++){
      if ((a[i]%2) != b[i]){
        return 0;
      }
    }
    return 1;
  }

  static int[] per(int a, int n){
    int[] b  = new int[n];
    int start = n-1;
    while(a>0){
      if ((a & 1) == 1){
        b[start] = 1;
      }
      start -= 1;
      a >>= 1;
    }
    return b;
  }
}
