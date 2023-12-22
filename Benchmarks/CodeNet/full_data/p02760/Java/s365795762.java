import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<Integer>();
    for (int i=0; i<9; i++){
      a.add(scan.nextInt());
    }
    int n = scan.nextInt();
    for (int j=0; j<n; j++){
      int t = scan.nextInt();
      if (a.contains(t) == true){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
