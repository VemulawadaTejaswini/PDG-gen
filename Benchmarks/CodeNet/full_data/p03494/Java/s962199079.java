import java.util.*;

public class Main{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
      int a = scanner.nextint();
      String b = String b = scanner.next();
      
      List<String> split = Arrays.asList(b.split(" "));
      
      int count = 0;
      String results = "";
      
      for(int i = 0; i < 999999 ; i++){
        if(results.equals("n")){
        	break;
        }
        if(i != 0){
            count += 1;
        }
          for(int j = 0; j < a ; j++ ){
            if(Integer.parseInt(split.get(j)) % 2 != 0){

              results = "n";
              break;
            }else{
              split.set(j,String.valueOf(Integer.parseInt(split.get(j)) / 2));
            }
        }
      }
     System.out.println(count);
    }
}