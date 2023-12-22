import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	
	
	public static void main(String[] args) {

			  Scanner scanner = null;
		      scanner = new Scanner(System.in);

		      int A = scanner.nextInt();
		      int B = scanner.nextInt();
		      List<Integer> C =  new ArrayList<>();
		      
		      int moveCount = 0;
		      if (A >= B) {
		    	  System.out.println(moveCount);
		    	  return;
		      }
		      
		      try{
		    	  while(true){
		    		  C.add(scanner.nextInt());  
		    	  }
		      } catch(Exception e){
		      }
		      
		      C = C.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		      
		      
		      List<Integer> D =  new ArrayList<>();
		      for (int i  = 0; i <= C.size() -1; i++ ) {
		    	  System.out.println(Math.abs(C.get(i) -C.get(i+1)));
		      }
		      
		      
		      

		}

}

