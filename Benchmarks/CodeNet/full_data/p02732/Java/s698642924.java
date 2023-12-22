import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.Stream;

class Main{
	public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      List<Integer> numbers = new ArrayList<Integer>();
      for(int i = 0; i<n;i++){
        numbers.add(scn.nextInt());
      }
      for(int j = 0; j<n;j++){
        List<Integer> newli = new ArrayList<Integer>();
        for(int k = 0;k<n;k++){
          if(k != j){
            newli.add(numbers.get(k));
          }
        }
        System.out.println(
          answer(newli)
        );
      }
	}
  	public static int answer(List<Integer> list){
      Set<Integer> set =  new HashSet<Integer>(list);
      int answer = 0;
      for(int i:set){
		int count = (int)list.stream()
                         .filter(num -> num == i)
                         .count();
        if(count>1) answer+= count*(count-1)/2;
      }
      return answer;
    }
}