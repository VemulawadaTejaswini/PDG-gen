import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	String line = sc.nextLine();
      	long n = sc.nextLong();
      
      	int i = 1;
    	long count = 0;
    	while(i <= line.length()-1){
    		if(line.charAt(i-1) == line.charAt(i)){
          		count++;
              	i += 2;
            }else{
              i++;
            }
         
    	}
      
      
      	System.out.println(count*n);
      	
    }
}