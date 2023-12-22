import java.util.Scanner;

class Main{
	
	public static void main(String args[]){
      
	  Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      
	  String nums[] = input.split(" ");
	  
	  // double eight = 8 / 100;
	  // double ten = 10 / 100;
	  
	  // long A = Long.parseLong(nums[0]);
	  // long B = Long.parseLong(nums[1]);
	  // long sum = Long.parseLong(nums[2]);
	  // int A = Integer.parseInt(nums[0]);
	  // int B = Integer.parseInt(nums[1]);
	  
	  StringBuilder S = new StringBuilder(nums[0]);
	  int Q = Integer.parseInt(nums[1]);
	  String Query;

	  for(int i = 0; i < Q;i++){
		  
		  Query = nums[i+2];
		  if(Query.subtring(0,1).equals("1")){
		  	S = S.reverse();
		  }else{
		    String Qs[] = Query.input.split(" ");
			if(Qs[1].equals("1")){
			  S = S.append(Qs[2]);
		    }else{
			  S = new StringBuilder(Qs[2] + S.toString());
			}
		}
	  }
	  
	      System.out.println(S.toString());
	  
	}
}
