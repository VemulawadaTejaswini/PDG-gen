import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next()); 
    ArrayList<Double> v= new ArrayList<Double>();
    for (int i=0; i < N ;i++) {
      v.add(sc.nextDouble());
    }
    Collections.sort(v);
    double sum = v.get(0);
    for (int i=1; i < N ;i++) {
      sum = (sum + v.get(i))/2;
    }
    System.out.println(sum);
  }
}

