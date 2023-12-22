import java.util.Scanner;
 
class Sample{
	public static void maine(String args[]){
		  Scanner scanner = new Scanner(System.in);
          String input = scanner.nextLine();
      
      	  List<String> split = Arrays.asList(input.split(" "));
          
      if(Integer.parseInt(split.get(0)) * Integer.parseInt(split.get(0)) % 2 == 0){
      	System.put.println("Even");
      }else{
        System.put.println("Odd");
      }
	}
}
