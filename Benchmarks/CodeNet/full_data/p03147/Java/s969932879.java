import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    List<Integer>  index = new ArrayList<>();
    int a = 0;
    for(int i = 0;i < n;i++){
      h[i] = sc.nextInt();
      if(i != 0 && h[i] <= h[i-1])
        index.add(i);
    }
    int sum = 0;
    for(int i = 0;i < index.size();i++){
      sum += h[index.get(i) - 1] - h[index.get(i)];
    }
    sum += h[n - 1];
    System.out.println(sum);
  }
}
 