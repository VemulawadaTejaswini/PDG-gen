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
      Boolean results = false;
      
      for(int i = 0; i < 999999 ; i++){
        if(results){
        	break;
        }
        if(i != 0){
            count += 1;
        }
          for(int j = 0; j < list.get(i) ; j++ ){
            if(list.get(j) % 2 != 0){
              results = true;
              break;
            }else{
              list.set(j,list.get(i) / 2);
            }
        }
      }
     System.out.println(count);
    }
}