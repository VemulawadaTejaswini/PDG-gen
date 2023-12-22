import java.util.*;

class main{
	public static void main (String[] args){
   		Scanner scanner = new Scanner(System.in);
      	
      	int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
      
       	if(a*b%2 == 0){
        	System.out.println("Even");
        }else{
        	System.out.println("Odd");
        }
    }
}