import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());

    String[] a = new String[n];
    int[] b = new int[n];

    for (int i=0; i<n; i++){
      a[i] = sc.next();
    }


    Arrays.sort(a);
    b[0] = 1;
    for (int i=1;i<n;i++){
      if(a[i].equals(a[i-1]))
        b[i] = b[i-1] + 1;
      else
        b[i] = 1;
    }
    int max = b[0];
    for(int i=0;i<n;i++){
      if (max<b[i])
        max = b[i];
    }

    for (int i=0; i<n; i++){
      if (b[i] == max)
        System.out.println(a[i]);
    }
  }
}
