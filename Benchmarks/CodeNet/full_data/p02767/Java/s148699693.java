import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    list.add(sc.nextInt());
    int sum = 1;
    int count = 1;
    int min = list.get(0);
    int max = list.get(0);
    
    for(int i = 0; i < list.size(); i++) {
      if(min > list.get(i)) {
        min = list.get(i);
      }
      if(max < list.get(i)) {
        max = list.get(i);
      }
    }
    int sum = 1000000;
    for(int k = min; k < max; k++) {
      int challengeSum;
      for(int j=0; j<list.size(); j++){
        challengeSum += (k -list.get(j))^2;
      }
      if(sum > challengeSum) {
        sum = challengeSum;
      }
    }
    System.out.println(challengeSum);
  }
}