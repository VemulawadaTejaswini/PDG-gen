import java.util.*;
 
public class Main{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      
      List<Integer> list = new ArrayList<>();
      
      for (int i = 0; i < n ; i++){
      	int b = scanner.nextInt();
        list.add(b);
      }
      
      int count = 0;
      Boolean results = true;
      
      while(results){
        
          for(int j = 0; j < list.size(); j++ ){
            if(list.get(j) % 2 != 0){
              results = false;
              break;
            }
              list.set(j,list.get(j) / 2);
        }
        if(results){
          count += 1;
        }
      }
     System.out.println(count);
    }
}