import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    while(sc.hasNext()){
    	list.add(sc.nextInt());
    }
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
    int sum = 100000000;
    int challengeSum = 0;
    for(int k = min; k < max; k++) {
      for(int j=0; j<list.size(); j++){
        challengeSum += (k -list.get(j))^2;
      }
      if(sum > challengeSum) {
        sum = challengeSum;
      }
    }
    System.out.println(sum);
  }
}