import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int[] x = new int[n];

    for (int i=0; i<n; i++)
      x[i] = Integer.parseInt(sc.next());

    int total = 0;

    for(int i=x[0]; i<=x[n-1]; i++){
      int tmp=0;
      for (int j=0; j<n; j++){
        tmp += (x[j]-i)*(x[j]-i);
      }
      if (i==x[0])
        total = tmp;
      if(tmp<total)
        total = tmp;
    }
    System.out.println(total);
  }
}
