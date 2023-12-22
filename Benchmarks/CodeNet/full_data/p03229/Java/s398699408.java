import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> a = new ArrayList<Integer>();
    for(int i=0; i<n; i++){
      a.add(sc.nextInt());
    }
    Collections.sort(a);
    if(n==2){
      System.out.println(Math.abs(a.get(0) - a.get(1)));
      System.exit(0);
    }
    int sa_sum = 0;
    int base_c = a.get(0);
    int base_r = a.get(n-1);
    int base_l = a.get(n-2);
    sa_sum = base_r + base_l - base_c*2;
    for(int i=1; i<n-2; i++){
      int sa_r = Math.abs(a.get(i) - base_r);
      int sa_l = Math.abs(a.get(i) - base_l);
      if(sa_r >= sa_l){
        sa_sum += sa_r;
        base_r = a.get(i);
      }
      else{
        sa_sum += sa_l;
        base_l = a.get(i);
      }
    }
    System.out.println(sa_sum);
  }
}