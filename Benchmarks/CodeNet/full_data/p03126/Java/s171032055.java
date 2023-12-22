import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] N = new int[30];
    int l = 0;
    while(sc.hasNextLine()){
      N[Integer.parseInt(sc.next())] += 1;
      l++;
    }
    List<Integer> X = new ArrayList();
    for(int i=0;i<30;i++)if(N[i]==l)X.add(i);
    for(int j:X)System.out.print(j);
  }
}
