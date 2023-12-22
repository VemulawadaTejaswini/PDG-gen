import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    System.out.println(N);

    String s = sc.nextLine();
    String[] a = s.split(" ", 0);

    int min = getMin(a);
    int max = getMax(a);

    System.out.println(max - min);

  }

  public static int getMin(String[] a){
    int min = 1001;
    for(int i = 0; i < a.length; i++) {
        int t = Integer.parseInt(a[i]);
        if(min > t) {
            min = t;
        }
    }
    return min;
  }

  public static int getMax(String[] a){
    int max = 0;
    for(int i = 0; i < a.length; i++) {
        int t = Integer.parseInt(a[i]);
        if(max < t) {
            max = t;
        }
    }
    return max;
  }
}