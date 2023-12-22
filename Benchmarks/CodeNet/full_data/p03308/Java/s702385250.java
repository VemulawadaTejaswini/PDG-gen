import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		for(int i = 1; i<= N ; i ++) {
			int ai = sc.nextInt();
			A.add(ai);
		}
		System.out.println(getMax(A) - getMin(A));
	}
	 private static int getMax(List<Integer> numbers){
	      int max = numbers.get(0);
	        
	      for(int i=1;i < numbers.size();i++){
	        
	         Integer number = numbers.get(i);
	            
	         if(number.intValue() > max){
	            max = number.intValue();
	         }
	      }
	      return max;
	   }
	    
	   private static int getMin(List<Integer> numbers){
	      int min = numbers.get(0);
	        
	      for(int i=1;i < numbers.size();i++){
	         Integer number = numbers.get(i);
	        
	         if(number.intValue() < min){
	            min = number.intValue();
	         }
	      }
	      return min;
	   }
	    

}