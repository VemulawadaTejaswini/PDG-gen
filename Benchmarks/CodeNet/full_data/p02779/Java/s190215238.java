import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.next());
    int[] a = new int[num];
    String ans = "YES";
    boolean judge = true;
    int count = 1;
    for (int i = 0; i<num; i++){
      a[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    while (judge && (count<num)){
      if(a[count-1] == a[count]){
        ans = "No";
        judge = false;
        break;
      }
      count++;
    }
    System.out.println(ans);
  }
}
