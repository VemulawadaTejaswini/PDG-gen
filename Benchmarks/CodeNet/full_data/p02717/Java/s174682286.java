import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<int> list = new ArrayList<int>();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    list.add(X);
    list.add(Y);
    list.add(0, Z);
    for(int i : list){
      System.out.print(i + " ");
    }
  }
}
      