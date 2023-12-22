import java.util.*;
import java.util.stream.Collectors;
 
public class Main{
 
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] row = new String[N];
        int[] count = new int[N];
      
        for(int i = 0; i < N; i++){
          row[i] =sc.next();
        }
      
        Arrays.sort(row);
        for(int i = 0; i < N; i++){
          for(int j = i+1; j < N; j++){
            if(row[i].equals(row[j])){
              count[i] +=1;
            }
          }
        }
      
        int Max = 0;
        ArrayList<String> select = new ArrayList<>();
        for(int i = 0; i < N; i++){
          if(Max < count[i]){
            Max = count[i];
          }
        }
        
      for(int i = 0; i < N; i++){
          if(Max == count[i]){
            select.add(row[i]);
          }
        }
      
      Collections.sort(select);
      List<String> list = select.stream().distinct().collect(Collectors.toList());
      for(int i = 0; i < list.size(); i++){
         System.out.println(list.get(i));
       }
	}
}