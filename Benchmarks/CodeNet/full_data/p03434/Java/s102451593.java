import java.util.*;
 import java.util.Comparator;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    
    for(int i=0; i<N;i++){
      list.add(sc.nextInt());
    }
    
    list.sort(Comparator.naturalOrder());
    
    int alice_sum = 0;
    int bob_sum = 0;
    int count = 0;
    for(int i=N;i<N;i--){
      if (count % 2 == 0){
        alice_sum += list[i];
      }
      else
      {
        bob_sum += list[i];
      }
      count++;
    }
    
    System.out.println(alice_sum-bob_sum);
  }
}