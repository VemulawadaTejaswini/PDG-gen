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

	  long A = Long.parseLong(nums[0]);
	  long B = Long.parseLong(nums[1]);

	  
	  long ansA = (A * 100) / 8;
	  if((A * 100) % 8 > 0){
	  	ansA++;
	  }
	  
	  long ansB = B * 10;
	  
	  if(ansA > ansB){
	    System.out.println(ansA);
	  }else{
	    System.out.println(ansB);
	  }
	  
	}
}
