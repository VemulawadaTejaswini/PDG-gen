import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	String line = sc.nextLine();
      	long n = sc.nextLong();
      
      	boolean flag = true;
      	for(int i = 1; i < line.length()-1; i++)
          if(line.charAt(i) != line.charAt(i-1)) flag = false;
      
      	if(flag){
          System.out.println(line.length()*n/2);
        }else{
        	if(line.charAt(0) == line.charAt(line.length()-1)){
              System.out.println(count(line)+n-1);
            }else
              System.out.println(count(line)) ;
        }  	  
    }
  
  	static long count(String line){
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
    	return count;
    }
}