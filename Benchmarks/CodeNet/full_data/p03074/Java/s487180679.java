import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();

    String s = scan.next();

    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Integer> b = new ArrayList<Integer>();

    boolean stop = false;
    char pre = s.charAt(0);
    if (pre == '0'){
      a.add(0);
    }
    int count = 1;
    for (int i=1;i<n;i++){
        char current = s.charAt(i);
        if (current == pre){
          count += 1;
          if (i == n-1){
            if (current == '1'){
              a.add(count);
            }
            else{
              b.add(count);
            }
          }
        }
        else{
          if (current == '1'){
            b.add(count);
          }
          else{
            a.add(count);
          }

          count = 1;

          if (i == n-1){
            if (current == '1'){
              a.add(count);
            }
            else{
              b.add(count);
            }
          }
        }
        pre = current;
    }

    a.add(0);

    if (k >= b.size()){
      System.out.println(n);
    }
    else{
      long sum = 0;
      long check = 0;
      int g = b.size();
      for (int i=0;i<=g-k;i++){
        check = 0;
        for (int j=0;j<k;j++){
          check += a.get(i+j);
          check += b.get(i+j);
        }
        check += a.get(i+k);
        sum = Math.max(sum,check);
      }
      System.out.println(sum);
    }
  }
}
